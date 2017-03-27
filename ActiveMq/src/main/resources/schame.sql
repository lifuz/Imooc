CREATE OR REPLACE PROCEDURE order_goods_statistic(dealDate IN TIMESTAMP)
AUTHID CURRENT_USER
IS
  str VARCHAR(3000);

  BEGIN


    str := 'INSERT INTO TB_STATISTIC_GOODS ' ||
           'SELECT STATISTIC_GOODS_SEQ.nextval,a.goods_id,a.goods_id,a.shop_id,a.saleCount,''' ||
            to_char(dealDate-1, 'yyyyMMdd') ||''',sysdate FROM ' ||
           '(SELECT b.goods_id,c.shop_id,sum(b.quantity) saleCount  FROM tb_order_goods b ' ||
           'RIGHT JOIN tb_order c ON b.order_id = c.order_id WHERE c.status = 8 AND b.goods_id is NOT NULL ' ||
           ' AND to_char(c.create_time,''yyyyMMdd'') = '''|| to_char(dealDate-1, 'yyyyMMdd') ||
           ''' GROUP BY b.goods_id, c.shop_id) a';
    EXECUTE IMMEDIATE str;

    COMMIT ;

    EXCEPTION
      WHEN OTHERS THEN
        dbms_output.put_line('SQL ERROR'||SQLERRM);
END;

SELECT
  a.goods_id          goodsId,
  a.goods_name        goodsName,
  a.shop_id,
  nvl(b.saleCount, 0) saleCount
FROM
  (SELECT
     goods_id,
     goods_name,
     shop_id
   FROM tb_goods
   GROUP BY goods_id, goods_name, shop_id) a
  LEFT JOIN (SELECT
               b.goods_id,
               c.shop_id,
               sum(b.quantity) saleCount
             FROM tb_order_goods b RIGHT JOIN tb_order c ON b.order_id = c.order_id
             WHERE c.status = 8
             GROUP BY b.goods_id, c.shop_id) b ON a.goods_id = b.goods_id
ORDER BY a.goods_name ASC;

SELECT b.goods_id,c.shop_id,sum(b.quantity) saleCount  FROM tb_order_goods b
           RIGHT JOIN tb_order c ON b.order_id = c.order_id WHERE c.status = 8 AND b.goods_id is NOT NULL
            AND to_char(c.create_time,'yyyyMMdd') =  '20170323'
            GROUP BY b.goods_id, c.shop_id
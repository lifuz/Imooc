package cn.lifuz.activemq.chapter1;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.*;

/**
 *
 * activemq 生产者实例
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2017/3/7 17:52
 */
public class ProducerApp {

    private static final String BROKER_URL = "tcp://121.41.64.237:61616";
    private static final String USER_NAME = "lifuz";
    private static final String PASSWORD = "Jick1201";
    private static final String SUBJECT = "test-activemq-queue";

    private static Logger logger = LoggerFactory.getLogger(ProducerApp.class);

    public static void main(String[] args) throws JMSException {
        //初始化连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(USER_NAME,PASSWORD,BROKER_URL);

        Connection conn = connectionFactory.createConnection();

        conn.start();

        Session session = conn.createSession(false,Session.CLIENT_ACKNOWLEDGE);
        Destination dest = session.createQueue(SUBJECT);
        MessageProducer producer = session.createProducer(dest);

        for (int i = 0 ; i < 10 ; i++) {
            //初始化一个mq消息
            TextMessage message = session.createTextMessage("hello active mq 中文" + i);

            //发送消息
            producer.send(message);
            logger.debug("send message {}", i);
        }
        conn.close();

    }


}

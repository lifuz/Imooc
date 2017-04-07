package cn.lifuz.mq.customer.topic;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2017/4/7 11:34
 */
@Component
public class TopicReceiver1 implements MessageListener {


    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("TopicReceiver1接收到消息:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
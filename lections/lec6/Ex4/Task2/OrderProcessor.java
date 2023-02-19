package OOP_all.lections.lec6.Ex4.Task2;

public class OrderProcessor {
    
    MailSender mailSender;
    OrderRepository orderRepository;

    public OrderProcessor(MailSender mailSender,OrderRepository orderRepository){

        this.mailSender = mailSender;
        this.orderRepository = orderRepository;

    }

    public void process(String order){
        if (orderRepository.save(order))
            mailSender.sendConfirmationEmail(order);
    }
}

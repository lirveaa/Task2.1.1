import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat_bean = (Cat) applicationContext.getBean("cat");
        Cat cat_bean2 = (Cat) applicationContext.getBean("cat");
        boolean isEqual =bean==bean2;
        boolean isEqual2 = cat_bean==cat_bean2;
        System.out.println(isEqual);
        System.out.println(isEqual2);
     }
}
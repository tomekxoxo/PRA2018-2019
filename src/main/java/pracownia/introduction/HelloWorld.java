package pracownia.introduction;

//import java.util.logging.Logger;
import org.apache.log4j.Logger;

public class HelloWorld {
    final static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String [ ] args) {

        System.out.println("Hello bitches");

        logger.info("Logger is running");
    }
}
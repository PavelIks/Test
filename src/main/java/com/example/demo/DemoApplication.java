// https://www.jetbrains.com/help/idea/your-first-spring-application.html#what-next
// https://spring.io/
package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

/*@RestController
@SpringBootApplication
public class DemoApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }

    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name)
    {
        return String.format("Hello " + name + "!");
    }
}*/

@SpringBootApplication
@RestController
public class DemoApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }
    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String Hello()
    {
        return String.format("Hello World!");
    }
    //http://localhost:8080/time
    @GetMapping("/time")
    public String Time()
    {
        Date date = new Date();
        return "<body>" +
                    "<div style='margin-left:30%; margin-top:20%; width:350px; border: 2px solid black;'>" +
                        "Now " + date.toString() +
                    "</div>" +
                "</body>";
    }
}
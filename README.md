# SpringBoot Example
This project is a "hello world" which demonstrates usage of SpringBoot, Gradle, Java, & VSCode.

I've taken [this example from spring.io](https://spring.io/guides/gs/spring-boot#initial), trimmed it down a bit, and tried to make sense of what components are absolutely essential for the slimmest repo

## Building
### IDE: VSCode
As a Visual Studio "Native App" loyalist, I was surprised at how easy it was to get up-and-running with all the necessary extensions in VSCode.

**Extensions to Install**
* Spring Boot Tools
* Gradle for Java
* Java (you'll need a JDK installed as well)

### Gradle Wrapper? What the Heck Is It?
You might notice the _./gradle/wrapper/_ with some java files in it. Turns out these are necessary as they ensure you are using a **specific version** of Gradle to build your project.

[This link](https://docs.gradle.org/current/userguide/gradle_wrapper.html) explains it probably better than I can.

## The Code
The Java code is very simple. The [initial tutorial link](https://spring.io/guides/gs/spring-boot#initial) explains things quite well, but I'll outline a few things here:

* The class uses an attribute, `@RestController`, meaning it is ready for use by Spring MVC to handle web requests
* The `@GetMapping` attribute on a method maps an endpoint to that method
* `@RestController` is actually a combination of `@Controller` and `@ResponseBody` - together these ensure that the requests result in a **data** response rather than a **view**

<img width="296" alt="firefox_9CPUzZZBXe" src="https://github.com/user-attachments/assets/b9092858-ec2c-41ba-bf7b-38bcdc7ec37e" />

Hmmm, this needs a bit of spicing up. I added a reference to jsoup and am now scraping _whitehouse.gov_ div class `wp-block-whitehouse-header__administration` to determine the current president of the US at any given time:

<img width="300" alt="firefox_pFhqboAIR5" src="https://github.com/user-attachments/assets/a73fcb7b-ce8e-4ede-891d-d4b3dcbb439a" />

A nice scary reminder.

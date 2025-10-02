# Spring Clone



## what "Spring Boot" actually adds

Spring Boot is basically **Spring + auto-configuration + embedded server + startup entrypoint**.
It doesn’t reinvent the IoC or MVC — it glues them together and makes “bootstrapping” zero-configuration.

here’s the minimal Boot responsibilities to aim for:

1. **An entrypoint (like `@SpringBootApplication`)** that knows how to launch everything.
2. **A custom "runner"** that:

   * Starts Spring’s `ApplicationContext` (IoC container).
   * Automatically scans packages for beans.
   * Spins up an embedded Tomcat server.
   * Registers Spring’s DispatcherServlet inside Tomcat.
   * Starts listening on a port.
3. **Auto-configuration flavor**:

   * configure the context (via classpath scanning + reflection) without XML or verbose setup.

---

## Why need to pass the root class again to the SpringCloneAplication(Same as the real springboot)

SpringClone.class is not the bean, it’s a pointer to your “application root” class.

Spring Boot uses this class to figure out where to start scanning for other beans/components/configs.
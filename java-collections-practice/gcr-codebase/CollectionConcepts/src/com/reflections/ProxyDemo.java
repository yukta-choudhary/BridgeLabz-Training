package com.reflections;
//Dynamic proxy logging

import java.lang.reflect.*;

interface Greeting {
 void sayHello();
}

class Hello implements Greeting {
 public void sayHello() {
     System.out.println("Hello!");
 }
}

class LogHandler implements InvocationHandler {

 Object obj;

 LogHandler(Object obj) {
     this.obj = obj;
 }

 public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
     System.out.println("Calling: " + method.getName());
     return method.invoke(obj, args);
 }
}

public class ProxyDemo {
 public static void main(String[] args) {

     Greeting g = (Greeting) Proxy.newProxyInstance(
             Hello.class.getClassLoader(),
             new Class[]{Greeting.class},
             new LogHandler(new Hello())
     );

     g.sayHello();
 }
}


# Tutorial 04 – Multi-threaded HTTP Server

This tutorial focuses on building a raw multi-threaded HTTP server in Java.  
It demonstrates how client requests are handled internally using low-level APIs without any web frameworks.

## Topics Covered
- HTTP request–response lifecycle
- Creating an HTTP server using Java
- Routing requests to different handlers
- Parsing query parameters
- Handling POST requests
- Multi-threading with ExecutorService
- Thread-safe request counting using AtomicInteger

## Technologies
- Java
- com.sun.net.httpserver.HttpServer
- Multi-threading (Executors)
- AtomicInteger

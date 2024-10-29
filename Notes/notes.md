






**Understanding Thread Safety Issues

1. My test scripts working fine when running sequentially but failing when ran in parallel. Have you faced this issue? What is causing this issue?
2. All local variables of primitive types are stored in Thread stack itself
3. All local variables of non primitive types are stored on stack but the object itself in heap
4. An object's member variable is stored in heap along with the object itself. (Primitive and Reference). If the thread has access to object, it also has access to its members.
5. Static class variables are also stored in the heap.

Ex. Problem -  when we make static webdriver as  Static class variables are also stored in the heap
               when we make parallel test two thread use same driver so it makes confusion for test
               It throws stale element exception
             
             
             
**Thread Local

1. Thread Local class helps to create variables that can be read and written by the same thread.
2. Easiest way to safeguard static class variables.
3. Creating a Thread Local variable.
4. Default value of a Thread Local variable.
5. Get, Set and Remove methods
6. Initial ThreadLocal value (Optional)
7. Inheritable Thread Local (Optional)
                



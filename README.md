# Covariant-Type-in-Java
From the release of JDK 1.5, covariant types were introduced in Java. 

In class Shape, the method draw returns ‘A’ which is a super type. Circle extends Shape and overrides the method draw. While overriding, the return type of this method is changed from A to B.We are replacing the supertype’s (A) instance with subtype’s (B) instance. 

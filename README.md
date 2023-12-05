
#### Bean Lifecycle
1. Bean construction (non-constructor invoked)
2. Setting the bean properties
3. Bean post-processor
4. Bean initialization
5. Bean post-processor
6. Bean being used
7. Bean destruction


### Factory Bean
The getObject() method from FactoryBean determines the kind of objects that will be created.
- This is usually used to integration third party tools such as MyBatis

### Annotation
- Starting from Java 5, support to annotation was added
- The annotation can be used on class, properties, methods
- Starting from Spring 2.5, annotation support has been added to simplify xml
- In the real application, annotation is more common than xml for configuration

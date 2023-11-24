# Design Patterns: Prototype

### 1. Quick idea about this pattern/Problem which this pattern solve?
An object that supports cloning is called a prototype. When your objects have dozens of fields and hundreds of possible configurations, cloning them might serve as an alternative to subclassing.

This pattern solve problem such as: you have an object, and you want to create an exact copy of it
### 2. Where should we use this pattern (examples)?
When we need to have the exact copy of the object
### 3. Pros and Cons
Pros:
- You can clone objects without coupling to their concrete classes
- You can get rid of repeated initialization code in favor of cloning pre-built prototypes
- You can produce complex objects more conveniently

Cons:
- Cloning complex objects that have circular references might be very tricky
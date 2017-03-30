# spark-content-type-test

1. To build and run execute
```
mvn clean install exec:java
```
2. Use a browser or postman to call http://localhost:4567/hello (returns an invalid PDF file)
3. Expected output was
```
before: beforeCounter = 1
before: getCounter = 0
before: afterCounter = 0
before: afterAfterCounter = 0
get: beforeCounter = 1
get: getCounter = 1
get: afterCounter = 0
get: afterAfterCounter = 0
after: beforeCounter = 1
after: getCounter = 1
after: afterCounter = 1
after: afterAfterCounter = 0
afterAfter: beforeCounter = 1
afterAfter: getCounter = 1
afterAfter: afterCounter = 1
afterAfter: afterAfterCounter = 1
```
But actual output is
```
before: beforeCounter = 1
before: getCounter = 0
before: afterCounter = 0
before: afterAfterCounter = 0
get: beforeCounter = 1
get: getCounter = 1
get: afterCounter = 0
get: afterAfterCounter = 0
after: beforeCounter = 1
after: getCounter = 1
after: afterCounter = 1
after: afterAfterCounter = 0
afterAfter: beforeCounter = 1
afterAfter: getCounter = 1
afterAfter: afterCounter = 1
afterAfter: afterAfterCounter = 1
before: beforeCounter = 2
before: getCounter = 1
before: afterCounter = 1
before: afterAfterCounter = 1
get: beforeCounter = 2
get: getCounter = 2
get: afterCounter = 1
get: afterAfterCounter = 1
after: beforeCounter = 2
after: getCounter = 2
after: afterCounter = 2
after: afterAfterCounter = 1
afterAfter: beforeCounter = 2
afterAfter: getCounter = 2
afterAfter: afterCounter = 2
afterAfter: afterAfterCounter = 2
```

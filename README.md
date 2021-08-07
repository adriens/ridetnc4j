# ridetnc4j

A Java SDK wrapper to interact with "Entreprises actives au Ridet", because getting ridet whould be as esay as :

```java
Entreprise ent = Entreprises.getEnterpriseFromRidet("0426049");
System.out.println(ent);
```

# Getting started

## Step 1. Add the JitPack repository to your build file 

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

## Step 2. Add the dependency

```xml
<dependency>
  <groupId>com.github.adriens</groupId>
  <artifactId>ridetnc4j</artifactId>
  <version>Tag</version>
</dependency>
```

## Interact

```java
// Get a perfect hit from a given Ridet
Entreprise ent = Entreprises.getEnterpriseFromRidet("0426049");
System.out.println(ent);

// Run a query : get entreprises (first page) where one one the fields matches "jardin"
int page = 1;
Entreprises.getEnterprisesFromQueryString("jardin", page);  
````

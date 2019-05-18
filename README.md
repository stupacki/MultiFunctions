# multi-functions [![Build Status](https://travis-ci.org/stupacki/MultiFunctions.svg?branch=master)](https://travis-ci.org/stupacki/MultiFunctions) [![](https://jitpack.io/v/stupacki/MultiFunctions.svg)](https://jitpack.io/#stupacki/MultiFunctions)

## download the latest Version of Multi Functions

#### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```groovy
allprojects {
	   	repositories {
	    	...
		    maven { url 'https://jitpack.io' }
	    }
	}
```

#### Step 2. Add the dependency
```groovy
dependencies {
	        compile 'com.github.stupacki:MultiFunctions:1.2.0'
	}
```

## What is this lib about?

Multi Functions is a extension Library written in Kotlin for processing and binding multiple Data to a single operation.
It extends the standard libraries of kotlin and can be used beside without effecting them.

## Examples

### Multi Let

You can use the multi let to bind multiple data values to a single operation without getting the hell of deep hierarchy structures in your code when you're trying to build one let binding after the next. Special for the multi let is, that all values passed to the function can be nullable. Like usual every parameter passed to the lambda can be named and accessed individually within it, but in a multiple way. The return type will be what you define as it or the last line of the lambda and can be null as well. If a data you pass to the let should't be null please use the ```?:``` operator to go further and define a fallback or default for that case. 

```kotlin
import io.multifunctions.let
   
val apiResult = Quad(userApi.get(userId),
                     ordersApi.get(userId),
                     favoritesApi.get(userId),
                     notesApi.get(userId))
                      
apiResult.let { user, orders, favorites, notes ->
    HttpResult.renderPage(user = user,
                          orders = orders,
                          favorites = favorites,
                          notes = notes)
}
```

### Multi LetCheckNull

If you really don't want to deal with null values within your let operations, letNotNull is your choice.

```kotlin
import io.multifunctions.letNotNull
   
val apiResult = Pair(userApi.get(userId),
                     ordersApi.get(userId))
                      
apiResult.letCheckNull { user, orders ->
    HttpResult.renderPage(user = user,
                          orders = orders)
}
```

### Multi Map

Multi Map can be used for data table tests. For example you have a function ```Calculate.xPlusY(x: Int?, y: Int?)``` and you want to test it with multiple test data you can do it like this (using Kotlin Test as testing framework):

```kotlin
import io.multifunctions.map
   
val testData = listOf(Triple(1, 1, 2)
                      Triple(-1, 1, 0)
                      Triple(-1, -1, -2)
                      Triple(0, 0, 0))
                      
testData.map { xData, yData, expectedResult ->
    Calculate.xPlusY(x = xData, y = yData) shouldBe expectedResult
}
```

You can do the same with MapNotNull if your function don't apply nullable values ```Calculate.xPlusY(x: Int, y: Int)```

```kotlin
import io.multifunctions.mapCheckNull
   
val testData = listOf(Triple(1, 1, 2)
                      Triple(-1, 1, 0)
                      Triple(-1, -1, -2)
                      Triple(0, 0, 0))
                      
testData.mapCheckNull { xData, yData, expectedResult ->
    Calculate.xPlusY(x = xData, y = yData) shouldBe expectedResult
}
```

# License

Distributed under the Apache 2.0 License. Copyright © 2017 Benny Schneider
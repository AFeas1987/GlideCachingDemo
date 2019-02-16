# GlideCachingDemo

A quick demo of the popular image-loading library [Glide](https://bumptech.github.io/glide/).

## Add Glide dependencies to Gradle

Adding **network images** requires *little effort* with Glide.

Start by including the following in your app's `build.gradle`:

```gradle
repositories {
  mavenCentral()
  google()
}

dependencies {
  implementation 'com.github.bumptech.glide:glide:4.9.0'
  annotationProcessor 'com.github.bumptech.glide:compiler:4.9.0'
}
```

## Loading network images

Images can be _loaded on-demand_ with automatically generated asynchronous network calls from Glide:

```java
Glide.with(context).load("http://goo.gl/gEgYUd").into(imageView);
```

## On to the demo...

The purpose of this demo is to provide a brief introduction to the Glide library.

![Demo part 1](https://i.imgur.com/Fa16q3V.gif)

Notice how the first time each button is clicked, there is a *slight delay* before the image appears.

The second time, however, the image appears *instantly*.

When the device is put into **_airplane mode_**:

![Demo part 2](https://i.imgur.com/MUMShBr.gif)

_What happened???_  The images are appearing **_instantly_**, and the device has **no network connection**!

On each call, Glide intelligently determines [the most efficient way](https://bumptech.github.io/glide/doc/caching.html#caching-in-glide) to load an image.

This means that Glide will find and load an image _from cache_, if it exists, and _avoid the network call_ altogether.

## Conclusion

This demonstrates the _usefulness_ and **power** that the Glide library provides within such **short syntax**.

It is easy to see that Glide has a place in even the simplest of Android projects.

### Good luck, and happy coding!

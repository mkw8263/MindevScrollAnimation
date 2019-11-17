# MindevScrollAnimation
## Demo
![gif](https://github.com/mkw8263/MindevScrollAnimation/blob/master/demo.gif)

## apply in project
[![](https://jitpack.io/v/mkw8263/MindecScrollAnimation.svg)](https://jitpack.io/#mkw8263/MindecScrollAnimation)
<h4>gradle</h4>
To get a Git project into your build:
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

````groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
````

Step 2. Add the dependency
````groovy
	dependencies {
	        implementation 'com.github.mkw8263:MindecScrollAnimation:0.01'
	}
````

## Use
<h4>sample xml</h4>

````xml
<?xml version="1.0" encoding="utf-8"?>
<com.mindev.animationscrollview.AnimationScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/scrollView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal"
        android:paddingStart="10dp"
        android:paddingTop="12dp"
        android:paddingEnd="10dp"
        android:paddingBottom="12dp">
        
            <com.mindev.animationscrollview.AnimationRotateImageView
                android:id="@+id/img_toys1"
                android:layout_width="50dp"
                android:layout_height="50dp"
                android:background="@drawable/ic_toys_24px" />

            <com.mindev.animationscrollview.AnimationRotateImageView
                android:id="@+id/img_toys2"
                android:layout_width="50dp"
                android:layout_height="50dp"
                android:background="@drawable/ic_toys_24px" />

            <com.mindev.animationscrollview.AnimationRotateImageView
                android:id="@+id/img_toys3"
                android:layout_width="50dp"
                android:layout_height="50dp"
                android:background="@drawable/ic_toys_24px" />

            <com.mindev.animationscrollview.AnimationRotateImageView
                android:id="@+id/img_toys4"
                android:layout_width="50dp"
                android:layout_height="50dp"
                android:background="@drawable/ic_toys_24px" />
        </LinearLayout>
</com.mindev.animationscrollview.AnimationScrollView>

````

<h4>kotlin code</h4>

````kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(scrollView){
            setUpListenerView(img_toys1)
            setUpListenerView(img_toys2)
            setUpListenerView(img_toys3)
            setUpListenerView(img_toys4)
        }
    }
}
````

## supported view
View|
---|
AnimationRotateButton|
AnimationRotateTextView|
AnimationRotateImageView|

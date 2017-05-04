一个自由定制的Material Design风格FloatingActionButton
== 
先来看看效果
-
![截图](https://github.com/dazhaoDai/FloatingActionButtonDemo/blob/master/src/main/java/com/ddz/pic/demo.gif)

根据GIF可以看出，是一个可折叠菜单式的FloatingActionButton，在部分App中我们也能见到这种效果，下面就一步步学习怎么使用，定制自己的FloatingActionButton

###### 1.添加依赖
添加依赖，在项目的build.gradle中添加```compile 'com.ddz.materialdesign:FloatingActionButton:1.0.2'```

###### 2. 布局
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:theme="@style/AppTheme.AppBarOverlay">

        <android.support.v7.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            android:background="?attr/colorPrimary"
            app:popupTheme="@style/AppTheme.PopupOverlay" />

    </android.support.design.widget.AppBarLayout>
    
    <com.ddz.floatingactionbutton.FloatingActionMenu
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
        android:layout_margin="@dimen/fab_margin">    //默认每个Button不设置标题

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_follow"
            app:fab_size="mini"/>

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_share"
            app:fab_size="mini" />

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_like"
            app:fab_size="normal"/>
    </com.ddz.floatingactionbutton.FloatingActionMenu>
</android.support.design.widget.CoordinatorLayout>
```
通过布局可以看出，默认FloatingActionMenu不设置背景图，而FloatingActionButton通过fab_icon分别设置背景图，通过fab_size设置大小

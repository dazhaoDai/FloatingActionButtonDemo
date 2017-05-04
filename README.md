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
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.ddz.floatingactionbutton.FloatingActionMenu
        android:id="@+id/fab1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/fab_margin">

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_share"
            app:fab_size="mini" />

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_like"
            app:fab_size="normal" />
    </com.ddz.floatingactionbutton.FloatingActionMenu>

    <com.ddz.floatingactionbutton.FloatingActionMenu
        android:id="@+id/fab2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_margin="@dimen/fab_margin"
        app:fab_addButton_icon="@drawable/icon_follow"
        app:fab_labelStyle="@style/lable_style">

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_colorNormal="@color/colorPrimary"
            app:fab_colorPressed="@color/colorPrimaryDark"
            app:fab_icon="@drawable/icon_follow"
            app:fab_size="mini"
            app:fab_title="顶部" />

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_like"
            app:fab_size="normal"
            app:fab_stroke_visible="false"
            app:fab_title="底部" />
    </com.ddz.floatingactionbutton.FloatingActionMenu>


    <com.ddz.floatingactionbutton.FloatingActionMenu
        android:id="@+id/fab3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_margin="5dp"
        app:fab_addButtonColorNormal="@color/colorPrimary"
        app:fab_addButtonColorPressed="@color/colorPrimaryDark"
        app:fab_addButtonPlusIconColor="@color/colorAccent"
        app:fab_addButtonSize="mini"
        app:fab_labelStyle="@style/lable_style">

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_follow"
            app:fab_size="mini"
            app:fab_title="顶部" />

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_like"
            app:fab_size="normal"
            app:fab_title="底部" />
    </com.ddz.floatingactionbutton.FloatingActionMenu>

    <com.ddz.floatingactionbutton.FloatingActionMenu
        android:id="@+id/fab4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_alignParentRight="true"
        android:layout_margin="5dp"
        app:fab_addButton_collapsed_rotation="0"
        app:fab_addButton_expanded_rotation="45"
        app:fab_addButton_rotation_duration="800"
        app:fab_labelStyle="@style/lable_style"
        app:fab_labelsPosition="right">

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_follow"
            app:fab_size="mini"
            app:fab_title="顶部" />

        <com.ddz.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_icon="@drawable/icon_like"
            app:fab_size="normal"
            app:fab_title="底部" />
    </com.ddz.floatingactionbutton.FloatingActionMenu>


</RelativeLayout>

```


布局很简单，一共四个FloatingActionMenu，每个Menu中两个FloatingActionButton，具体效果看图
![效果](https://github.com/dazhaoDai/FloatingActionButtonDemo/blob/master/src/main/java/com/ddz/pic/GIF.gif)

为了更好的理解每个Menu中属性的含义，罗列出FloatingActionMenu的自定义属性

###### FloatingActionMenu自定义属性：

``` fab_addButtonColorNormal  //菜单按钮默认颜色
  fab_addButtonColorPressed   //菜单按钮按下的颜色
  fab_addButtonPlusIconColor  //菜单按钮上的“+”号颜色，当设置了icon，“+”不会显示
  fab_addButtonSize        //菜单按钮的大小，有normal 和 mini 两种状态
  fab_addButtonStrokeVisible   //菜单按钮“+”边框是否可见
  fab_addButton_collapsed_rotation  //菜单按钮折叠时的角度
  fab_addButton_expanded_rotation   //菜单按钮展开的角度
  fab_addButton_icon     //菜单按钮的图标，设置了icon则“+”不可见
  fab_addButton_rotation_duration   //菜单按钮展开/折叠的时间
  fab_expandDirection     //菜单按钮展开的方向，有up/down/left/right四个方向，left/right时，Button不可以设置标签文字 
  fab_labelsPosition     //Button的标签文字相对Button的位置，有 left /right两种
  fab_labelStyle       //设置标签文字的Style，只有Menu设置了 fab_labelStyle， Button才可以显示文字
  ```
###### FloatingActionButton自定义属性：

```colorDisabled   //Button按钮不可操作时的颜色
   fab_colorNormal      //Button按钮正常状态的颜色
   fab_colorPressed     //Button按钮按下时的颜色
   fab_icon              //Button按钮设置图标
   fab_size              ///Button按钮设置大小，同样有 normal 和 mini 两种大小
   fab_stroke_visible    //Button按钮边框是否可见  
   fab_title              //Button按钮的标签文字
```

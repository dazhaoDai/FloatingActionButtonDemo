一个自由定制的Material Design风格FloatingActionButton
== 
先来看看效果
-
![截图](https://github.com/dazhaoDai/FloatingActionButtonDemo/blob/master/src/main/java/com/ddz/pic/demo.gif)

根据GIF可以看出，是一个可折叠菜单式的FloatingActionButton，在部分App中我们也能见到这种效果，下面就一步步学习怎么使用，根据个人需求，开发自己定制的Material Design 风格的 折叠 FloatingActionButton； 

项目依赖的是[一个自由定制的Material Design风格FloatingActionButton](https://github.com/dazhaoDai/FloatingActionButtonDemo),库不大，但是功能齐全。

如果有特别需求，也可以根据库改写，里面注释很详细，很好理解，或者到简书下留言，期待大家共同把这个库完善起来

使用起来很简单，只需要两步 ：依赖、布局， 就可以完成

#### 1.添加依赖

添加依赖，在项目的build.gradle中添加
```
dependencies {
    compile 'com.ddz.materialdesign:FloatingActionButton:1.0.4'
}
'```

#### 2. 布局
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

具体到每个Menu， 

第一个Menu:  fab1,

``` 
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
```

Menu 没有任何设置， 上部分Button设置大小为mini，设置Icon，下部分大小为normal, 设置了Icon
    
第二个Menu:  fab2
    
```
    <com.ddz.floatingactionbutton.FloatingActionMenu
        android:id="@+id/fab2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_margin="@dimen/fab_margin"
        app:fab_addButton_icon="@drawable/icon_follow"
        app:fab_labelStyle="@style/lable_style">
        <!-- 设置fab_title 时， 必须设置 fab_labelStyle ，才会生效-->

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
```
Menu部分： 设置了图标 fab_addButton_icon，设置了fab_labelStyle

Button部分 ：上部分Button设置了按下颜色 fab_colorPressed和正常的颜色 fab_colorNormal，以及图标fab_icon，大小fab_size为mini，设置了标签         fab_title  ，下部分 Button 设置了 图标fab_icon，按钮大小 fab_size，按钮边缘不可见 fab_stroke_visible ，标签文字 fab_title
    
第三个Menu：  fab3
    
```
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
```
Menu部分：设置了按钮 按下的颜色fab_addButtonColorNormal、正常的颜色fab_addButtonColorPressed、按钮“+” 的颜色 fab_addButtonPlusIconColor
按钮大小fab_addButtonSize、以及fab_labelStyle

Button部分： 上部分 设置了图标 fab_icon、 button大小 fab_size、 标签文字 fab_title   ，下部分同上
    
第四个Menu： fab4
    
```
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
```
Menu部分 ：设置了折叠角度 fab_addButton_collapsed_rotation， 展开角度fab_addButton_expanded_rotation，展开或折叠时间       fab_addButton_rotation_duration，设置了标签文字样式 fab_labelStyle， 设置了文字在按钮的位置 fab_labelsPosition

Button部分：设置了icon、size和title
    
通过上面四个Menu对比，很清楚的看到每个Menu的区别，以及对应的属性作用
    
##### FloatingActionMenu 补充
FloatingActionMenu有展开折叠的监听事件
```
      fl_menu = (FloatingActionMenu) findViewById(R.id.fab1);
      fl_menu.setOnFloatingActionsMenuUpdateListener(new FloatingActionMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                Toast.makeText(MainActivity.this, "打开", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onMenuCollapsed() {
                Toast.makeText(MainActivity.this, "折叠", Toast.LENGTH_SHORT).show();
            }
        });
        //也可以代码设置Menu的图标
        fl_menu.setButtonIcon(R.drawable.icon_like);
```
        
##### FloatingActionButton 补充
代码中可以对Button的进行更改
        
```
         fl_button = (FloatingActionButton) findViewById(R.id.fl_button);
        fl_button.setTitle("你好");
        fl_button.setIcon(R.drawable.icon_share);
        fl_button.setSize(20);
        fl_button.setColorNormal(getResources().getColor(R.color.colorAccent));
        fl_button.setColorPressed(getResources().getColor(R.color.colorAccent));
```

#### 写在最后
如果有特殊需求，大家可以star 或者 fork一份，进行完善， 也欢迎大家提出更好的方法
感谢 
> http://luckymin.com/
> https://github.com/futuresimple/android-floating-action-button

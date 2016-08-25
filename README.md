# SwipeBackDemo
为APP提供一个滑动手势来关闭当前页面，引入该方案对原有项目的改动较小，仅仅两个java文件。

#特别感谢
该项目基于 [liuguangqiang's SwipeBack library](https://github.com/liuguangqiang/SwipeBack),在此对原作者表示感谢! 

#效果预览
![preview](https://github.com/freecats/SwipeBackDemo/blob/master/preview.gif)


同时你也可以扫描二维码下载apk到手机里面进行体验【推荐】<br>
![demo apk](https://github.com/freecats/SwipeBackDemo/blob/master/2016_08_25_1242579550.png)

#我的改动
* 无需设置透明主题。
  * 避免因该主题而引起的副作用，例如：Activity切换动画失效、VideoView/SurfaceView变透明而无法显示内容、滑动关闭时部分手机会显示桌面。但是因此也割舍了界面随手势进行滑动的效果，目前的滑动效果类似新浪微博或者QQ的右滑关闭效果，具体可以看预览动态图片效果。
  

* 滑动手势与界面内滑动控件不冲突。
  * 滑动的触发为边缘触发，默认是手势的ACTION_DOWN在屏幕边缘50个像素单位内可以触发滑动关闭操作，滑动距离超过一定距离则执行关闭当前Activity操作；如果ACTION_DOWN落点距离屏幕边缘大于50个像素单位，那么将触发操作交给界面View而不进行拦截.
  
#如何使用
* 将工程下载到本地，把`SwipeBackAppCompatActivity.java` 和`SwipeBackLayout.java`两个文件以及一些资源属性复制到你自己工程的对应目录或文件中，将你的`BaseActivity`继承至`SwipeBackAppCompatActivity`
* 如果要实现Demo一样的Activity启动、退出动画，那么复制anim目录下的动画文件到自己的工程中，然后给自己的Activity配置动画主题即可
<br>
<br>
`(为啥不支持Gradle dependencies引入,恩？哈哈哈，因为一是所需的文件就几个直接复制完事，二是我还没发布上传到jcenter啥的，也不打算传)`

# License



    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

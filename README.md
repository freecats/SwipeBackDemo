# SwipeBackDemo
为APP提供一个滑动手势来关闭当前页面，引入该方案对原有项目的改动较小，仅仅两个java文件。

#特别感谢
该项目基于 [liuguangqiang's SwipeBack library](https://github.com/liuguangqiang/SwipeBack),在此对原作者表示感谢! 

#效果预览
![preview](https://github.com/freecats/SwipeBackDemo/blob/master/preview.gif)

#我的改动
* 无需设置透明主题。
  * 避免因该主题而引起的副作用，例如：Activity切换动画失效、VideoView/SurfaceView变透明而无法显示内容、滑动关闭时部分手机会显示桌面。但是因此也割舍了界面随手势进行滑动的效果，目前的滑动效果类似新浪微博或者QQ的右滑关闭效果，具体可以看预览动态图片效果。
  

* 滑动手势与界面内滑动控件不冲突。
  * 滑动的触发为边缘触发，默认是手势的ACTION_DOWN在屏幕边缘50个像素单位内可以触发滑动关闭操作，滑动距离超过一定距离则执行关闭当前Activity操作；如果ACTION_DOWN落点距离屏幕边缘大于50个像素单位，那么将触发操作交给界面View而不进行拦截.
  
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

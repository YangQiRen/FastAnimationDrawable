# FastAnimationDrawable
原作者github：https://github.com/VDshixiaoming/AnimationTest

原作者url：https://blog.csdn.net/wanmeilang123/article/details/53929484

```java
AnimationsContainer.FramesSequenceAnimation animation
                = AnimationsContainer.getInstance(R.array.winning_anim, 15, false).createProgressDialogAnim(imgWinningGif);
        animation.start();
```

### 新增oneShot設定是否重播

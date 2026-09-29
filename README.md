# Ch02_01_TextViewImageView

Android 教材微型 Demo —— **Demo 2.1 TextView 和 ImageView**

> 第一批次任务清单：按照 `学号 % 10` 的结果选择 demo 编号。
>
> - 姓名：`（请填写）`
> - 学号：`（请填写）`，学号 % 10 = `（请填写余数）`
> - 对应 Demo：**Demo 2.1 TextView 和 ImageView**

## 一、任务目标

在一个页面中显示文字和本地图片。

## 二、使用的组件

| 组件 | 用途 |
| --- | --- |
| LinearLayout | 纵向排列页面内容 |
| TextView | 显示标题和图片说明 |
| ImageView | 显示 Logo 或头像 |
| drawable 资源 | 保存普通图片（`res/drawable/logo_workbuddy.png`） |
| strings.xml | 保存文字 |

## 三、组件使用要求对照

| 要求 | 实现位置 |
| --- | --- |
| 1. LinearLayout 方向设置为垂直 | `activity_main.xml` → `android:orientation="vertical"` |
| 2. ImageView 必须设置明确的宽高 | `activity_main.xml` → `android:layout_width/height="220dp"` |
| 3. 使用 scaleType 控制图片显示方式 | `activity_main.xml` → `android:scaleType="centerCrop"` |
| 4. 图片不得使用电脑绝对路径 | `activity_main.xml` → `android:src="@drawable/logo_workbuddy"` |
| 5. 图片说明必须通过 TextView 显示 | `activity_main.xml` → `@+id/tv_image_description`，文字来自 `strings.xml` |

## 四、验收标准自查

- [x] 图片可以正常显示：本地 PNG 已放入 `res/drawable`，通过 `@drawable` 引用
- [x] 图片无明显拉伸变形：512×512 正方形图片 + 正方形 ImageView + `centerCrop`
- [x] 文字和图片排列合理：标题 → 介绍文字 → 图片 → 图片说明（自上而下）

## 五、工程结构

```
Ch02_01_TextViewImageView/
├─ app/src/main/
│  ├─ AndroidManifest.xml
│  ├─ java/com/example/ch02_01_textviewimageview/
│  │  └─ MainActivity.java                # 仅加载布局，逻辑全在 XML
│  └─ res/
│     ├─ drawable/logo_workbuddy.png      # 本地图片资源（512×512）
│     ├─ layout/activity_main.xml         # 页面布局（垂直 LinearLayout）
│     └─ values/
│        ├─ strings.xml                   # 所有文字统一存放
│        ├─ colors.xml
│        └─ themes.xml
├─ build.gradle / settings.gradle         # AGP 8.5.2 + Gradle 8.7
├─ AIUsage.md                             # AI 使用说明
└─ README.md
```

## 六、环境与运行

- Android Studio（建议 Koala 2024.1.1 或更新版本）
- compileSdk 34 / minSdk 24 / targetSdk 34 / Java / androidx.appcompat 1.7.0

运行步骤：

1. 克隆本仓库，或下载压缩包解压
2. Android Studio → **Open** → 选择 `Ch02_01_TextViewImageView` 文件夹
3. 等待 Gradle 同步完成（首次会自动下载 Gradle 8.7 与依赖）
4. 点击 Run 运行到模拟器或真机

> 国内网络较慢时，可将 `gradle/wrapper/gradle-wrapper.properties` 中的 `distributionUrl`
> 替换为腾讯镜像：`https://mirrors.cloud.tencent.com/gradle/gradle-8.7-bin.zip`

## 七、界面说明

页面自上而下依次为：标题（22sp 加粗）→ 介绍文字（15sp 灰色）→ 220dp 见方 Logo 图片（居中）→ 图片说明（14sp 灰色）。

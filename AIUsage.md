# AI 使用说明（AIUsage）

> 课程要求：仓库中需包含 AIUsage.md，如实说明完成本 Demo 过程中 AI 的使用情况。

## 一、基本信息

- 作业：第一微型 Demo —— Demo 2.1 TextView 和 ImageView（工程名 `Ch02_01_TextViewImageView`）
- 完成日期：2026-09-29
- 姓名 / 学号：周皓琪 / 20250551421（学号 % 10 = 1）

## 二、使用的 AI 工具

| 工具 | 使用环节 |
| --- | --- |
| WorkBuddy 编程助手（DeepSeek 模型） | 工程骨架生成、布局与资源文件编写、图片资源生成、问题排查 |

## 三、AI 具体做了什么

1. **解析任务**：将课程截图（Demo 2.1 的组件使用要求与验收标准）提供给 AI，由 AI 整理出 5 条硬性要求与 3 条验收标准。
2. **生成工程**：AI 按课程约定生成完整可编译的 Android 工程，包括：
   - Gradle 配置（AGP 8.5.2 / Gradle 8.7 / minSdk 24 / targetSdk 34 / Java）
   - `MainActivity.java`（仅 `setContentView` 加载布局）
   - `activity_main.xml`（垂直 LinearLayout：标题 TextView + 介绍 TextView + ImageView + 图片说明 TextView）
   - `strings.xml`、`colors.xml`、`themes.xml`
3. **生成图片资源**：本机 pip 无法联网安装 Pillow，AI 改用 Python 标准库（zlib + struct）手写 PNG 编码，生成 512×512 笑脸头像 `logo_workbuddy.png` 放入 `res/drawable`，避免图片使用绝对路径。
4. **质量检查**：AI 对全部 XML 做了格式校验（5 个文件全部通过），并生成界面预览页供人工核对效果。

## 四、本人（人工）完成的部分

- 核对课程要求与验收标准，逐条确认代码实现（对照表见 README.md 第三节、第四节）。
- 在 Android Studio 中打开、同步、编译并运行，确认界面与图片显示正常。
- 填写个人信息、初始化 git 仓库并提交、推送到远程后提交仓库地址。

## 五、遇到的问题与解决

| 问题 | 解决方式 |
| --- | --- |
| pip 无法联网安装 Pillow | 改用 Python 标准库（zlib + struct）直接生成 PNG |
| Gradle wrapper jar 下载超时 | 保留 `gradle-wrapper.properties`，由 Android Studio 首次打开时自动补齐 |

## 六、使用心得

AI 能快速搭出符合规范的工程骨架，并代劳资源生成、格式校验等琐事，明显节省时间；但要求核对、运行验证与最终把关仍需本人完成。把「要求 → 实现 → 验收」逐条对照后再提交，是保证作业质量的关键。

# coursier_classifiers_issue
How to replicate:
1. Enter project A, run sbt publishLocal
2. Enter project B, reload project, two dependencies from project A can be observed (whole project + assets)
3. Uncomment Coursier in project B/project/plugins.sbt
4. Reload project, only one dependency form project A goes into classpath, assets are ignored

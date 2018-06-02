# Documenting a JVM project
This repo is connected with a blog post.  
Below you can find only some basic information about running/viewing.  
The blog post describes everything in more details.  

## AsciiDoc + PlantUML
1. `mvn clean package`  with `generate-html-docs` profile selected  
2. you can find your docs here: `documenting-project/documentation/target/generated-docs/docs.html`  

you can perform step 1 both in the `parent` project and in the `documentation` module
## Swagger
1. run `Application`  
2. head to `localhost:8080/documentation`  
3. click around  

[1]: https://graphviz.gitlab.io/_pages/Download/Download_windows.html

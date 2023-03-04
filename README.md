# [Construct](https://www.construct.net/) Framework
## This is an automation framework for the [Construct 3 Game Engine](https://editor.construct.net/) written in [Java](https://www.java.com/en/), using [Selenium](https://www.selenium.dev/) libraries and the [Microsoft Edge WebDriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/).

[Construct](https://www.construct.net/) is currently the most powerful in-browser game engine available. We can use browser automation to extend this already potent functionality.

### Automate uploading of assets — Completion: 0%

[Construct](https://www.construct.net/) doesn't accept external spritesheets, and its import process is tedious. It also crashes if you upload too much at once. We'll create a script which automatically uploads assets in small batches.

![image](https://user-images.githubusercontent.com/87336074/222923563-ae1db8c7-5019-43fd-9412-0d85f984bf68.png)

### Build a [Page Object Model](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/) — Completion: 40%

We'll build a [POM](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/) for every interactible bit of the [Construct](https://www.construct.net/) engine. This will make writing future automation much quicker. It also enables this framework to be used to test addons, or the engine as a whole.

![2023-03-04_11-17-46](https://user-images.githubusercontent.com/87336074/222924772-3dec50ad-07e2-4100-bc43-4b69e778cc7a.gif)

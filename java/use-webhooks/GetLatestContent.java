// DocSection: using_webhooks_get_latest_content
// Tip: Find more about Java SDK at https://kontent.ai/learn/java
import kentico.kontent.delivery.*;

DeliveryOptions deliveryOptions = new DeliveryOptions();
deliveryOptions.setProjectId("<YOUR_PROJECT_ID>");
deliveryOptions.setWaitForLoadingNewContent(true);

DeliveryClient client = new DeliveryClient(deliveryOptions);

CompletionsStage<ContentItemResponse> item = client.getItem("my_article");
// To use the code for Android projects, see http://kontent.ai/learn/android
// EndDocSection
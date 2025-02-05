// DocSection: structure_in_rte_retrieve_article
// Tip: Find more about Java SDK at https://kontent.ai/learn/java
SimpleArticle item = client.getItem("my_article", SimpleArticle.class);

String description = item.toCompletableFuture().get().getBodyCopy();
// To use the code for Android projects, see http://kontent.ai/learn/android
// EndDocSection
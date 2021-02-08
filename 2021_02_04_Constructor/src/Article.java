public class Article {

        String title;
        String announce;
        String fulltext;
        int id;

        public Article(){
            title = "unknow";
            announce = "Anons";
            fulltext = "text";
        }
        public Article (String articleTitle, String artickeAnnounce){
            title = articleTitle;
            announce = artickeAnnounce;

        }

        public Article (int articleID, String articleTitle, String articleAnnounce) {
            id = articleID;
            title=articleTitle;
            announce=articleAnnounce;
        }

}

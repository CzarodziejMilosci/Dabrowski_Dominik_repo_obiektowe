mport java.time.LocalDate;

class ToDo{
    private String title = "";
    private String content = "";
    private String author = "Anonymous";
    private LocalDate date = LocalDate.now();

    //constructor author unknown
    public ToDo(String title, String content){
        this.title = title;
        this.content = content;
    }

    //constructor author known
    public ToDo(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public String getContent(){
        return content;
    }
    public LocalDateTime getDate(){
        return date;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "Title: "+title+"\n"
            +"Content: "+content+"\n"
            +"Author: "+author+"\n"
            +"Data: "+date+"\n";
    }
}
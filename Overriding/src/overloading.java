class SearchService{
    void search(String username){
        System.out.println("Searching Username : "+username);
    }

    void search(int id){
        System.out.println("Searching ID : "+id);
    }

    void search(String username,String email){
        System.out.println("Searching user by name and email : "+username+ " "+email);
    }
}

public class overloading {
    public static void main(String[] args){
        SearchService service= new SearchService();

        service.search("u","e");
    }
}
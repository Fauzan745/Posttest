package com.Fauzan355.posttest; // Added semicolon

//import com.example.harrypotter.Book;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("en/books")
    Call<List<Book>> getBooks(); // Java method syntax
}

package steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class GetMethods {

    public  static  void getMethodCharacter(String number){

        given().contentType(ContentType.JSON)
                .when().get("https://rickandmortyapi.com/api/character/"+number)
                .then().body("name",is("Beth Smith")).statusCode(200);
    }
    public  static  void characterQueryParam(){
        given().contentType(ContentType.JSON)
                .queryParam("name","rick")
                .queryParam("status","alive")
                .when().get("https://rickandmortyapi.com/api/character")
                .then().statusCode(200)
                .body("results[0].gender",equalTo("Male"))
                .body("results[0].species",equalTo("Human"));
    }
    public  static  void episode(String name){
        List<String> names= RestAssured.when().get("https://rickandmortyapi.com/api/episode")
                .then().extract().jsonPath()
                .getList("results.name");

        Assert.assertTrue(names.contains(name));
        System.out.println("Size of names:"+names.size());
        System.out.println(names);

        List<String> episodes=RestAssured.when().get("https://rickandmortyapi.com/api/episode")
                .then().extract().jsonPath()
                .getList("results.episode");

        Assert.assertTrue(episodes.contains("S02E05"));
        System.out.println("size of episodes"+episodes.size());
        System.out.println(episodes);
    }
    public static void location(){
        given().get("https://rickandmortyapi.com/api/location/3")
                .then().body("type", Matchers.not("space")).statusCode(200);
    }

}

package Data;

import com.mongodb.*;

/**
 * Created by tkilic on 19.04.2018.
 */
public class App {
    public static void main(String[] args) {
        MongoClient m1=new MongoClient("localhost",27017);
        DB database=m1.getDB("test");
        DBCollection collection=database.getCollection("user");

        //Veri Ekleme
        /*
        BasicDBObject obj=new BasicDBObject()
                .append("name","Stephen Hawking")
                .append("date","1942")
                .append("country","England")
                .append("dateofdeath","2018");

        BasicDBObject obj2=new BasicDBObject()
                .append("name","Isaac Newton")
                .append("date","1643")
                .append("country","England");

        WriteResult result=collection.insert(obj);
        WriteResult result2=collection.insert(obj2);

        System.out.println(result);
        System.out.println(result2); */

         /*

        //Veri Listeleme

        DBCursor list=collection.find();
        while(list.hasNext()){
            System.out.println(list.next());
        }*/

        /*

         // Veri Güncelleme
        BasicDBObject newobj=new BasicDBObject()
                .append("name","Stephen Hawking")
                .append("date","1941")
                .append("country","England")
                .append("dateofdeath","2018");

      collection.update(
              new BasicDBObject("date","1942"),
              new BasicDBObject("$set",newobj)
      );*/

        /*
        //Collection Silme

        collection.drop();
*/
   //Veritabani Silme
        database.dropDatabase();

    }

}

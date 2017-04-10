package models;

import play.data.format.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class Article extends Model
{
    @Id
    @GeneratedValue
    private Long id;
    public String title;
    @Column(columnDefinition = "TEXT")
    public String body;
}
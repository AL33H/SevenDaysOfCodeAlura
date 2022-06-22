
package br.com.sevendaysofcodealura.model;

import lombok.Data;

import java.io.Serializable;

@Data
@SuppressWarnings("unused")
public class ItemDTO implements Serializable {

    private String Crew;
    private String FullTitle;
    private String Id;
    private String ImDbRating;
    private String ImDbRatingCount;
    private String Image;
    private String Rank;
    private String Title;
    private String Year;
}

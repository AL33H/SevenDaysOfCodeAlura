
package br.com.sevendaysofcodealura.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
@SuppressWarnings("unused")
public class ResponseImdbDTO implements Serializable {

    private String ErrorMessage;
    private List<ItemDTO> Items;
}

package com.iapi.drools.bean.indexitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
* @Author cheng
* @Description //TODO
* @Date 17:02 2019/1/18
* @Param
* @return
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestIndexItem  implements Serializable {
    private List<IndexItem> indexItems;


}

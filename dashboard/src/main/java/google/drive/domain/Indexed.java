package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private String fileName;
    private String location;
    private Long fileId;
    private List<String> keywords;
}

package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String type;
    private Long size;
    private String fileName;
    private String dateTime;
    private String userId;
}

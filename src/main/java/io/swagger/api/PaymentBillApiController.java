package io.swagger.api;

import io.swagger.model.CreateRequest;
import io.swagger.model.Errors;
import io.swagger.model.GenericResponse;
import io.swagger.model.ListResponse;
import io.swagger.model.UpdateRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:20:35.844Z[GMT]")
@Controller
public class PaymentBillApiController implements PaymentBillApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentBillApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentBillApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GenericResponse> create(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody CreateRequest body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GenericResponse>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"header\" : {\n    \"id\" : \"id\",\n    \"type\" : \"type\"\n  },\n  \"id\" : \"id\"\n}", GenericResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GenericResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GenericResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GenericResponse> delete(@ApiParam(value = "paymet bill ID",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GenericResponse>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"header\" : {\n    \"id\" : \"id\",\n    \"type\" : \"type\"\n  },\n  \"id\" : \"id\"\n}", GenericResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GenericResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GenericResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListResponse> paymentBillClientDocumentClientDocumentTypeGet(@ApiParam(value = "client document number",required=true) @PathVariable("clientDocument") String clientDocument
,@ApiParam(value = "client document type",required=true) @PathVariable("clientDocumentType") String clientDocumentType
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListResponse>(objectMapper.readValue("{\n  \"header\" : {\n    \"id\" : \"id\",\n    \"type\" : \"type\"\n  },\n  \"paymentBill\" : [ {\n    \"clientDocumentType\" : \"clientDocumentType\",\n    \"date\" : \"date\",\n    \"amount\" : \"amount\",\n    \"originAccountNumber\" : \"originAccountNumber\",\n    \"_rev\" : \"_rev\",\n    \"description\" : \"description\",\n    \"destinationAccountNumber\" : \"destinationAccountNumber\",\n    \"clientDocument\" : \"clientDocument\",\n    \"frequency\" : 0.8008281904610115,\n    \"destinationAccountType\" : \"destinationAccountType\",\n    \"originAccountType\" : \"originAccountType\",\n    \"name\" : \"name\",\n    \"_id\" : \"_id\"\n  }, {\n    \"clientDocumentType\" : \"clientDocumentType\",\n    \"date\" : \"date\",\n    \"amount\" : \"amount\",\n    \"originAccountNumber\" : \"originAccountNumber\",\n    \"_rev\" : \"_rev\",\n    \"description\" : \"description\",\n    \"destinationAccountNumber\" : \"destinationAccountNumber\",\n    \"clientDocument\" : \"clientDocument\",\n    \"frequency\" : 0.8008281904610115,\n    \"destinationAccountType\" : \"destinationAccountType\",\n    \"originAccountType\" : \"originAccountType\",\n    \"name\" : \"name\",\n    \"_id\" : \"_id\"\n  } ]\n}", ListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListResponse> paymentBillIdGet(@ApiParam(value = "payment bill ID",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListResponse>(objectMapper.readValue("{\n  \"header\" : {\n    \"id\" : \"id\",\n    \"type\" : \"type\"\n  },\n  \"paymentBill\" : [ {\n    \"clientDocumentType\" : \"clientDocumentType\",\n    \"date\" : \"date\",\n    \"amount\" : \"amount\",\n    \"originAccountNumber\" : \"originAccountNumber\",\n    \"_rev\" : \"_rev\",\n    \"description\" : \"description\",\n    \"destinationAccountNumber\" : \"destinationAccountNumber\",\n    \"clientDocument\" : \"clientDocument\",\n    \"frequency\" : 0.8008281904610115,\n    \"destinationAccountType\" : \"destinationAccountType\",\n    \"originAccountType\" : \"originAccountType\",\n    \"name\" : \"name\",\n    \"_id\" : \"_id\"\n  }, {\n    \"clientDocumentType\" : \"clientDocumentType\",\n    \"date\" : \"date\",\n    \"amount\" : \"amount\",\n    \"originAccountNumber\" : \"originAccountNumber\",\n    \"_rev\" : \"_rev\",\n    \"description\" : \"description\",\n    \"destinationAccountNumber\" : \"destinationAccountNumber\",\n    \"clientDocument\" : \"clientDocument\",\n    \"frequency\" : 0.8008281904610115,\n    \"destinationAccountType\" : \"destinationAccountType\",\n    \"originAccountType\" : \"originAccountType\",\n    \"name\" : \"name\",\n    \"_id\" : \"_id\"\n  } ]\n}", ListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GenericResponse> update(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody UpdateRequest body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GenericResponse>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"header\" : {\n    \"id\" : \"id\",\n    \"type\" : \"type\"\n  },\n  \"id\" : \"id\"\n}", GenericResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GenericResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GenericResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}

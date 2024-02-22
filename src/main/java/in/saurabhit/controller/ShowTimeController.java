package in.saurabhit.controller;

import in.saurabhit.payload.request.ShowTimeDtoRequest;
import in.saurabhit.payload.response.ShowTimeDtoResponse;
import in.saurabhit.service.ShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/showtime")
public class ShowTimeController {


    @Autowired
    private ShowTimeService showTimeService;

    @PostMapping("/{movieId}/{hallId}")
    public ResponseEntity<ShowTimeDtoResponse> addNewShowTime( @RequestBody ShowTimeDtoRequest showTimeDtoRequest, @PathVariable Integer movieId, @PathVariable Integer hallId){

        ShowTimeDtoResponse showTimeDtoResponse1 = this.showTimeService.addNewShowTime(showTimeDtoRequest,movieId,hallId);

        return new ResponseEntity<>(showTimeDtoResponse1, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ShowTimeDtoResponse>> getAllShowTimings()
    {
        List<ShowTimeDtoResponse> showTimeDetails = this.showTimeService.getShowTimeDetails();

        return new ResponseEntity<>(showTimeDetails,HttpStatus.OK);
    }



}







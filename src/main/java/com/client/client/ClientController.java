package com.client.client;


import com.client.client.model.Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping
    public List<Client> getList(){
        return List.of(new Client(1,"John", "Doe"),
                new Client( 2,"Emma", "Johnson"),
                new Client( 3, "Michael", "Smith"),
                new Client(4,"Olivia", "Brown"),
                new Client(5, "Daniel", "Williams")
        );
    }


    @GetMapping("/{id}")
    public Client getById(@PathVariable Integer id){
        return new Client(id,"John", "Doe");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client add(@RequestBody Client client){
        return new Client(1,"John", "Doe");
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Client update(@RequestBody Client client) {
        return client;
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Integer id) {
        log.info("This is deleted succesfully "+ id);
    }
}

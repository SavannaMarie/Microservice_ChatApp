package com.savchat.savchat.client;

import com.savchat.savchat.dto.DirectoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "DirectoryClient", url = "${DirectoryClient}")
public interface DirectoryClient {

    @PostMapping("/")
    public void addEntry(@RequestBody final DirectoryDTO pEntry);

    @GetMapping("/{username}")
    public int getEntry(@PathVariable("username") final String pName);

    @DeleteMapping("/{username}")
    public void removeEntry(@PathVariable("username") final String pName);

    @GetMapping("/")
    public Map<String, Integer> getDirectory();

}
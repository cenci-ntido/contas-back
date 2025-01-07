package com.example.contas.controller;


import com.example.contas.dto.RegistroDTO;
import com.example.contas.model.Registro;
import com.example.contas.service.ICrudService;
import com.example.contas.service.IRegistroService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registros")
@CrossOrigin
public class RegistroController extends CrudController<Registro, RegistroDTO, Long> {

    private static IRegistroService expenseDetailService;
    private static ModelMapper modelMapper;

    public RegistroController(IRegistroService expenseDetailService,
                              ModelMapper modelMapper) {
        super(Registro.class, RegistroDTO.class);
        RegistroController.expenseDetailService = expenseDetailService;
        RegistroController.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<Registro, Long> getService() {
        return RegistroController.expenseDetailService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return RegistroController.modelMapper;
    }
}

/*
    @PostMapping // http://localhost:8025/categories
    public ResponseEntity<AccountDTO> create(@RequestBody @Valid AccountDTO category) {
        Category categorySaved = accountService.create( convertToEntity( category ) );
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .buildAndExpand(categorySaved.getId()).toUri();

        return ResponseEntity.created(location).body(convertToDTO(categorySaved));
    }

    @PutMapping("{id}") //http://localhost:8025/categories/{id} em que {id} = um long
    public ResponseEntity<Category> update(@RequestBody @Valid Category category,
                                           @PathVariable Long id) {
        accountService.update(category);
        return ResponseEntity.ok(category);
    }

    @GetMapping
    public ResponseEntity<List<AccountDTO>> findAll() {

        return ResponseEntity.ok(
                accountService.findAll().stream().map(
                        this::convertToDTO).collect(Collectors.toList()
                )
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<Category> findOne(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(accountService.findOne(id));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(name = "id") Long id) {
        accountService.delete(id);
    }

    private Category convertToEntity(AccountDTO categoryDTO) {
        return modelMapper.map(categoryDTO, Category.class);
    }

    private AccountDTO convertToDTO(Category category) {
        return modelMapper.map(category, AccountDTO.class);
    }
}
 */

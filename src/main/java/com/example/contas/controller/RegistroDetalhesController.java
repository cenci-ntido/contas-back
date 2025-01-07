package com.example.contas.controller;


import com.example.contas.dto.RegistroDetalheDTO;
import com.example.contas.model.RegistroDetalhe;
import com.example.contas.service.ICrudService;
import com.example.contas.service.IRegistroDetalheService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registro_detalhes")
public class RegistroDetalhesController extends CrudController<RegistroDetalhe, RegistroDetalheDTO, Long> {

    private static IRegistroDetalheService expenseDetailService;
    private static ModelMapper modelMapper;

    public RegistroDetalhesController(IRegistroDetalheService expenseDetailService,
                                      ModelMapper modelMapper) {
        super(RegistroDetalhe.class, RegistroDetalheDTO.class);
        RegistroDetalhesController.expenseDetailService = expenseDetailService;
        RegistroDetalhesController.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<RegistroDetalhe, Long> getService() {
        return RegistroDetalhesController.expenseDetailService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return RegistroDetalhesController.modelMapper;
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

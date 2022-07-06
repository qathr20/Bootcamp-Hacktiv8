@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "hargaBeli")
    private int hargaBeli;
    
    @Column(name = "hargaJual")
    private int hargaJual;


1. Login Register JWT (Sesi 18)
2. Data Bus (Kalau mau cepet, langsung buka sesi terakhir, minimal buat model, repository)
3. Konek data pakai JWT (nampilin data bus contohnya)
4. Kalau bisa konek Swagger, konek
5. Kalau bisa Heroku, taro aja

DROP TABLE IF EXISTS public.proposal;
DROP TABLE IF EXISTS public.inventaris_lab;
DROP TABLE IF EXISTS public.lab;

CREATE TABLE public.inventaris_lab (
    inventaris_id integer NOT NULL,
    lab_kode character varying(50),
    nama_barang text NOT NULL,
    spesifikasi jsonb NOT NULL,
    jumlah integer DEFAULT 1 NOT NULL,
    lokasi text,
    tanggal_perolehan date,
    catatan text,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);

CREATE SEQUENCE public.inventaris_lab_inventaris_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER SEQUENCE public.inventaris_lab_inventaris_id_seq OWNED BY public.inventaris_lab.inventaris_id;

CREATE TABLE public.lab (
    kode character varying(50) NOT NULL,
    nama character varying(255),
    nama_internasional character varying(255),
    deskripsi text
);

CREATE TABLE public.proposal (
    proposal_id integer NOT NULL,
    topik_id integer,
    nim_pengusul character varying(50),
    nim_anggota character varying(50),
    judul_proposal text,
    lab_id character varying(50),
    literatur_utama character varying(255),
    literatur_penunjang character varying(255),
    catatan_khusus text,
    dosen_pembimbing_1_id smallint,
    deskripsi text,
    form_kesediaan text,
    draft text
);

CREATE SEQUENCE public.proposal_proposal_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER SEQUENCE public.proposal_proposal_id_seq OWNED BY public.proposal.proposal_id;

ALTER TABLE ONLY public.inventaris_lab ALTER COLUMN inventaris_id SET DEFAULT nextval('public.inventaris_lab_inventaris_id_seq'::regclass);

ALTER TABLE ONLY public.proposal ALTER COLUMN proposal_id SET DEFAULT nextval('public.proposal_proposal_id_seq'::regclass);

-- Data tabel inventaris_lab
INSERT INTO public.inventaris_lab VALUES (1, 'NCS', 'Router MikroTik CCR1009', '{"port": {"sfp": 1, "ethernet": 8}, "tags": ["network", "router"], "fitur": ["BGP", "VPN", "Firewall"], "merek": "MikroTik", "model": "CCR1009", "status": "aktif", "firmware": "RouterOS v7.14", "supplier": {"nama": "PT Netindo", "kontak": {"email": "sales@netindo.id", "telepon": "+62-21-555-111"}}}', 2, 'Rak-1 Jaringan', '2025-01-12', 'Unit utama untuk praktikum routing', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (2, 'NCS', 'Firewall Appliance', '{"tags": ["security", "firewall"], "fitur": ["Stateful Firewall", "IDS/IPS", "OpenVPN"], "merek": "Netgate", "model": "pfSense-Plus", "status": "aktif", "throughput_gbps": 1.8}', 1, 'Rak-2 Security', '2025-03-02', 'Uji IDS/IPS kelas keamanan', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (3, 'IVSS', 'Kamera AI Vision', '{"fitur": ["object-detection", "object-tracking"], "merek": "Sony", "sensor": "CMOS", "dataset": ["COCO", "Custom"], "aksesori": ["tripod", "lighting-kit"], "resolusi": "4K", "integrasi": {"framework": ["PyTorch", "TensorFlow"]}}', 3, 'Studio-1', '2025-02-05', 'Untuk proyek deteksi objek', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (4, 'IVSS', 'GPU Workstation', '{"os": "Ubuntu 22.04", "cpu": "Intel i9-13900K", "gpu": "RTX 4090", "merek": "NVIDIA", "tools": ["CUDA", "cuDNN", "Docker"], "ram_gb": 128, "storage": [{"tipe": "NVMe", "kapasitas_gb": 2000}, {"tipe": "SATA", "kapasitas_gb": 4000}]}', 1, 'Ruang Komputasi', '2024-11-21', 'Training model visi komputer', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (5, 'SE', 'Server CI/CD GitLab', '{"cpu": "AMD EPYC", "backup": {"jadwal": "harian", "retensi_hari": 14}, "ram_gb": 256, "layanan": ["GitLab", "Runner", "Registry"], "storage_raid": {"level": 10, "total_tb": 16}, "virtualisasi": ["KVM", "Docker"]}', 1, 'Server Room-SE', '2024-12-10', 'Build & deploy otomatis tugas besar', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (6, 'DT', 'Cluster Mini Big Data', '{"nodes": 3, "network": "10GbE", "software": ["Hadoop", "Spark"], "management": {"monitoring": "Prometheus+Grafana", "orchestrator": "Ansible"}, "storage_tb": 12}', 1, 'Rak-1 DT', '2025-04-03', 'Praktikum ETL & distributed processing', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (7, 'BA', 'Workstation Analitik', '{"cpu": "Intel i7-13700", "gpu": "RTX 3060", "merek": "Dell", "tools": ["Power BI", "Tableau", "Jupyter"], "ram_gb": 64, "lisensi": {"office": true, "tableau": "creator"}, "connectors": ["PostgreSQL", "CSV", "Parquet"]}', 5, 'Area BA-1', '2025-02-18', 'Kelas dashboard & forecasting', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (8, 'MMT', 'Printer 3D', '{"tipe": "Ender 3 V2", "fitur": ["heated-bed", "silent-driver"], "merek": "Creality", "material": ["PLA", "ABS", "PETG"], "area_cetak_mm": {"x": 220, "y": 220, "z": 250}}', 2, 'Studio Prototipe', '2025-01-27', 'Prototipe casing & mockup', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (9, 'MMT', 'Kamera 360', '{"fitur": ["stabilization", "HDR"], "merek": "Insta360", "output": ["MP4", "DNG"], "resolusi": "5.7K", "workflow": {"editor": "DaVinci", "export": "H.265"}}', 1, 'Studio-2', '2025-05-09', 'Produksi konten VR', '2025-10-12 21:29:23.415819');
INSERT INTO public.inventaris_lab VALUES (10, 'AI', 'Kit IoT ESP32', '{"sensor": ["DHT22", "LDR", "HC-SR04"], "platform": "ESP32", "protokol": ["MQTT", "HTTP"], "supplier": {"nama": "MakerHub", "kontak": {"email": "support@makerhub.id", "telepon": "+62-811-000-123"}}, "aksesoris": ["breadboard", "jumper-wires", "oled-0.96"], "kompatibilitas": ["Arduino", "MicroPython"]}', 10, 'Meja IoT-1', '2025-03-15', 'Praktikum IoT & integrasi cloud', '2025-10-12 21:29:23.415819');

-- Data tabel lab
INSERT INTO public.lab VALUES ('NCS', 'Lab Jaringan dan Keamanan Siber', 'Network & Cyber Security Lab', 'Laboratorium yang berfokus pada penelitian dan pengembangan sistem jaringan komputer serta keamanan siber. Aktivitas di lab ini mencakup pengujian infrastruktur jaringan, analisis kerentanan sistem, implementasi firewall dan IDS/IPS, serta simulasi serangan siber untuk mendukung pembelajaran keamanan jaringan secara praktis.');
INSERT INTO public.lab VALUES ('IVSS', 'Lab Visi Intelijen & Sistem Cerdas', 'Intelligence Vision & Smart Systems Lab', 'Laboratorium yang mengkaji bidang visi komputer, kecerdasan buatan, dan sistem cerdas adaptif. Kegiatan penelitian meliputi pengenalan pola, machine learning, deep learning, serta pengembangan sistem penglihatan mesin untuk berbagai aplikasi seperti pengawasan otomatis, pengenalan wajah, dan robotika cerdas.');
INSERT INTO public.lab VALUES ('SE', 'Lab Rekayasa Perangkat Lunak', 'Software Engineering Lab', 'Laboratorium yang berfokus pada rekayasa dan pengembangan perangkat lunak secara terstruktur dan berkelanjutan. Mahasiswa dan peneliti mempelajari metodologi pengembangan sistem, DevOps, pengujian perangkat lunak, serta penerapan praktik agile dan CI/CD untuk menghasilkan solusi perangkat lunak yang berkualitas dan skalabel.');
INSERT INTO public.lab VALUES ('DT', 'Lab Teknologi Data', 'Data Technology Lab', 'Laboratorium yang berfokus pada rekayasa data skala besar, mulai dari perancangan pipeline ETL/ELT, integrasi data, hingga pemodelan data untuk gudang data dan lakehouse. Aktivitas meliputi orkestrasi workflow, pengolahan terdistribusi, kualitas & governance data, serta analitik terapan untuk pengambilan keputusan berbasis data.');
INSERT INTO public.lab VALUES ('BA', 'Lab Analitik Bisnis', 'Business Analytics Lab', 'Laboratorium yang mengkaji analitik bisnis, business intelligence, dan sains data untuk mendukung keputusan strategis. Penelitian dan praktikum mencakup peramalan, pemodelan statistik, eksperimen A/B testing, serta pengembangan dashboard interaktif yang terintegrasi dengan berbagai sumber data organisasi.');
INSERT INTO public.lab VALUES ('MMT', 'Lab Teknologi Multimedia', 'Multimedia Technology Lab', 'Laboratorium yang mempelajari grafika komputer, pemrosesan citra dan video, serta produksi konten interaktif. Kegiatan meliputi komputasi visual, rendering, kompresi media, pengembangan AR/VR, dan perancangan antarmuka multimodal untuk pengalaman pengguna yang imersif dan informatif.');
INSERT INTO public.lab VALUES ('AI', 'Lab Informatika Terapan', 'Applied Informatics Lab', 'Laboratorium yang berfokus pada penerapan informatika lintas domain, termasuk integrasi sistem, IoT, dan otomasi cerdas. Riset dan praktikum mencakup perancangan arsitektur end-to-end (edge–cloud), pemodelan AI terapan, serta integrasi sensor/aktuator untuk solusi industri dan layanan publik.');

-- Data tabel proposal
INSERT INTO public.proposal VALUES (1, 1, '234001', '234002', 'Sistem Deteksi Intrusi Jaringan dengan CNN', 'NCS', 'Paper A', 'Paper B', 'Butuh dataset tambahan', 1, 'Penelitian ini bertujuan untuk membangun sistem deteksi intrusi jaringan berbasis Convolutional Neural Network (CNN) yang mampu mengenali pola anomali dalam lalu lintas data secara otomatis. Sistem ini diharapkan dapat membantu administrator jaringan dalam mengidentifikasi serangan siber dengan tingkat akurasi yang tinggi, serta memberikan peringatan dini terhadap potensi ancaman keamanan.', 'Form A', 'Draft A');
INSERT INTO public.proposal VALUES (2, 2, '234003', '234004', 'Analisis Sentimen Twitter Bahasa Indonesia', 'IVSS', 'Paper X', 'Paper Y', 'Butuh API premium', 2, 'Studi ini berfokus pada analisis sentimen terhadap cuitan pengguna Twitter berbahasa Indonesia menggunakan teknik Natural Language Processing (NLP). Penelitian akan membandingkan beberapa algoritma klasifikasi seperti Naive Bayes, SVM, dan LSTM untuk menentukan metode terbaik dalam mendeteksi emosi dan opini publik terhadap isu-isu sosial dan ekonomi di Indonesia.', 'Form B', 'Draft B');
INSERT INTO public.proposal VALUES (3, 4, '234005', '234008', 'Sistem Rekomendasi E-Learning untuk Mahasiswa', 'SE', 'Paper C', 'Paper D', 'Perlu dataset aktivitas mahasiswa', 4, 'Proposal ini mengusulkan pengembangan sistem rekomendasi e-learning berbasis perilaku mahasiswa. Sistem akan menganalisis riwayat interaksi pengguna dengan platform pembelajaran untuk merekomendasikan materi yang relevan secara personal. Dengan demikian, diharapkan proses pembelajaran menjadi lebih efektif dan sesuai dengan kebutuhan akademik masing-masing mahasiswa.', 'Form C', 'Draft C');
INSERT INTO public.proposal VALUES (4, 5, '234006', '234007', 'Dashboard Bisnis untuk UMKM', 'IVSS', 'Paper Z', 'Paper W', 'Butuh data penjualan real', 5, 'Penelitian ini bertujuan untuk merancang dan membangun dashboard bisnis interaktif yang membantu pelaku UMKM dalam memantau performa penjualan, stok produk, serta tren keuangan. Dashboard ini akan dikembangkan dengan visualisasi data yang mudah dipahami sehingga pemilik usaha dapat mengambil keputusan strategis berbasis data (data-driven decision making).', 'Form D', 'Draft D');
INSERT INTO public.proposal VALUES (5, 7, '234009', '234012', 'Monitoring Jaringan IoT dengan Dashboard', 'NCS', 'Paper IoT1', 'Paper IoT2', 'Butuh perangkat ESP32', 6, 'Penelitian ini mengembangkan sistem monitoring jaringan Internet of Things (IoT) menggunakan dashboard interaktif. Sistem akan menampilkan status perangkat IoT secara real-time, mencatat anomali jaringan, dan memberikan notifikasi apabila terjadi gangguan koneksi. Teknologi yang digunakan meliputi MQTT, ESP32, serta integrasi data dengan PostgreSQL untuk pemantauan yang terpusat.', 'Form IoT', 'Draft IoT');
INSERT INTO public.proposal VALUES (6, 8, '234010', '234011', 'Analisis Penjualan E-Commerce', 'IVSS', 'Paper Ecom1', 'Paper Ecom2', 'Perlu dataset tambahan', 7, 'Proposal ini mengkaji analisis penjualan e-commerce dengan pendekatan data mining dan visual analytics. Tujuannya adalah menemukan pola pembelian pelanggan, produk terlaris, serta faktor musiman yang memengaruhi volume penjualan. Hasil analisis ini dapat dimanfaatkan oleh pemilik toko online untuk menyusun strategi promosi yang lebih efektif.', 'Form Ecom', 'Draft Ecom');
INSERT INTO public.proposal VALUES (7, 9, '234012', '234013', 'Sistem Absensi RFID untuk Kelas', 'SE', 'Paper RFID1', 'Paper RFID2', 'Perlu hardware RFID', 8, 'Penelitian ini bertujuan untuk merancang sistem absensi mahasiswa berbasis RFID (Radio Frequency Identification) yang terintegrasi dengan database kampus. Dengan sistem ini, proses pencatatan kehadiran menjadi lebih cepat, akurat, dan bebas dari manipulasi. Sistem juga akan menampilkan laporan kehadiran secara otomatis kepada dosen dan pihak administrasi.', 'Form RFID', 'Draft RFID');
INSERT INTO public.proposal VALUES (8, 10, '234013', '234014', 'Chatbot Pelayanan Akademik', 'SE', 'Paper Bot1', 'Paper Bot2', 'Butuh NLP engine', 7, 'Studi ini mengusulkan pengembangan chatbot cerdas yang mampu menjawab pertanyaan mahasiswa terkait layanan akademik, seperti jadwal kuliah, pengisian KRS, dan status administrasi. Chatbot akan memanfaatkan teknologi Natural Language Processing (NLP) untuk memahami pertanyaan pengguna dan memberikan jawaban yang relevan secara otomatis melalui antarmuka berbasis web atau pesan instan.', 'Form Bot', 'Draft Bot');
INSERT INTO public.proposal VALUES (9, 3, '234004', NULL, 'Sistem Informasi Inventaris Barang', 'SE', 'Paper C', 'Paper D', 'Masih butuh analisis kebutuhan', NULL, 'Penelitian ini mengembangkan sistem informasi untuk mengelola data inventaris barang di lingkungan laboratorium atau jurusan. Sistem ini akan mencatat data barang masuk dan keluar, memantau kondisi serta lokasi penyimpanan, dan menghasilkan laporan inventaris secara otomatis. Dengan sistem ini, diharapkan proses manajemen aset menjadi lebih efisien dan transparan.', 'Form C', 'Draft C');
INSERT INTO public.proposal VALUES (10, 2, '234002', NULL, 'Aplikasi Manajemen Keuangan Mahasiswa', 'IVSS', 'Paper E', 'Paper F', 'Perlu studi literatur tambahan', NULL, 'Proposal ini mengusulkan pembuatan aplikasi manajemen keuangan bagi mahasiswa untuk membantu mengatur pengeluaran, pemasukan, serta perencanaan anggaran bulanan. Aplikasi ini juga akan menyediakan visualisasi laporan keuangan dan fitur pengingat pembayaran, sehingga mahasiswa dapat mengelola keuangannya dengan lebih baik dan disiplin.', 'Form D', 'Draft D');


SELECT pg_catalog.setval('public.inventaris_lab_inventaris_id_seq', 10, true);
SELECT pg_catalog.setval('public.proposal_proposal_id_seq', 10, true);

ALTER TABLE ONLY public.inventaris_lab
    ADD CONSTRAINT inventaris_lab_pkey PRIMARY KEY (inventaris_id);

ALTER TABLE ONLY public.lab
    ADD CONSTRAINT lab_pkey PRIMARY KEY (kode);

ALTER TABLE ONLY public.proposal
    ADD CONSTRAINT proposal_nim_anggota_key UNIQUE (nim_anggota);

ALTER TABLE ONLY public.proposal
    ADD CONSTRAINT proposal_nim_pengusul_key UNIQUE (nim_pengusul);

ALTER TABLE ONLY public.proposal
    ADD CONSTRAINT proposal_pkey PRIMARY KEY (proposal_id);

CREATE INDEX idx_inventaris_lab_spesifikasi_gin ON public.inventaris_lab USING gin (spesifikasi);

ALTER TABLE ONLY public.proposal
    ADD CONSTRAINT fk_proposal_lab FOREIGN KEY (lab_id) REFERENCES public.lab(kode);

ALTER TABLE ONLY public.inventaris_lab
    ADD CONSTRAINT inventaris_lab_lab_kode_fkey FOREIGN KEY (lab_kode) REFERENCES public.lab(kode) ON DELETE CASCADE;

-- Created on 2025-10-12 21:32:28 WIB
--
-- By: Yoppy Yunhasnawa
-- yunhasnawa@gmail.com
-- https://yunhasnawa.github.io
--
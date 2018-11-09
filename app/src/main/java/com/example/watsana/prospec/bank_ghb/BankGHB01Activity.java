package com.example.watsana.prospec.bank_ghb;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.watsana.prospec.R;

import java.util.Calendar;

public class BankGHB01Activity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button buttonDate;
    private EditText EditTextDate;
    private int day, month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_ghb01);

//      Province Spinner
        provinceSpinner();

//      Province1 Spinner
        province1Spinner();

//      Prapet Spinner
        prapetSpinner();
    }

    //    จังหวัด อำเภอ ตำบล
    private void provinceSpinner() {
        Spinner spinner = findViewById(R.id.spinnerProvince);
        String[] strings = new String[]{"เลือกจังหวัด", "กระบี่", "กรุงเทพมหานคร", "กาญจนบุรี", "กาฬสินธุ์", "กำแพงเพชร", "ขอนแก่น", "จันทบุรี", "ฉะเชิงเทรา", "ชลบุรี"
                , "ชัยนาท", "ชัยภูมิ", "ชุมพร", "ตรัง", "ตราด", "ตาก", "นครนายก", "นครปฐม", "นครพนม", "นครราชสีมา", "นครศรีธรรมราช", "นครสวรรค์", "นนทบุรี", "นราธิวาส",
                "น่าน", "บึงกาฬ", "บุรีรัมย์", "ปทุมธานี", "ประจวบคีรีขันธ์", "ปราจีนบุรี", "ปัตตานี", "พระนครศรีอยุธยา", "พะเยา", "พังงา", "พัทลุง", "พิจิตร", "พิษณุโลก", "ภูเก็ต", "มหาสารคาม",
                "มุกดาหาร", "ยะลา", "ยโสธร", "ระนอง", "ระยอง", "ราชบุรี", "ร้อยเอ็ด", "ลพบุรี", "ลำปาง", "ลำพูน", "ศรีสะเกษ", "สกลนคร", "สงขลา", "สตูล", "สมุทรปราการ", "สมุทรสงคราม",
                "สมุทรสาคร", "สระบุรี", "สระแก้ว", "สิงห์บุรี", "สุพรรณบุรี", "สุราษฎร์ธานี", "สุรินทร์", "สุโขทัย", "หนองคาย", "หนองบัวลำภู", "อำนาจเจริญ", "อุดรธานี",
                "อุตรดิตถ์", "อุทัยธานี", "อุบลราชธานี", "อ่างทอง", "เชียงราย", "เชียงใหม่", "เพชรบุรี", "เพชรบูรณ์", "เลย", "แพร่", "แม่ฮ่องสอน", "ประจวบคีรีขันธ์", "ชุมพร"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB01Activity.this,
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                createSpinnerAmper(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void createSpinnerAmper(int position) {

        Spinner spinner = findViewById(R.id.spinnerAmper);
        String[] mainAmperStrings = new String[79];
        mainAmperStrings[0] = "เลือกอำเภอ/เขต";
        mainAmperStrings[1] = "เลือกอำเภอ/เขต,คลองท่อม,ปลายพระยา,ลำทับ,อ่าวลึก,เกาะลันตา,เขาพนม,เมืองกระบี่,เหนือคลอง";
        mainAmperStrings[2] = "คลองสาน,คลองสาน,คลองสามวา,คลองเตย,คันนายาว,จตุจักร,จอมทอง,ดอนเมือง,ดินแดง,ดุสิต,ตลิ่งชัน,ทวีวัฒนาทุ่งครุ,ธนบุรี,บางกอกน้อย,บางกอกใหญ่,บางกะปิ,บางขุนเทียน,บางคอแหลม,บางซื่อ,บางบอน,บางพลัด" +
                ",บางรัก,บางเขน,บางแค,บึงกุ่ม,ปทุมวัน,ประเวศ,ป้อมปราบศัตรูพ่าย,พญาไท,พระนคร,พระโขนง,ภาษีเจริญ,มีนบุรี,ยานนาวา,ราชเทวี,ราษฎร์บูรณะ,ลาดกระบัง,ลาดพร้าว,วังทองหลาง,วัฒนา,สวนหลวง,สะพานสูง,สัมพันธวงศ์,สาทร,สายไหม,หนองจอก,หนองแขม,หลักสี่,ห้วยขวาง";
        mainAmperStrings[3] = "ด่านมะขามเตี้ย,ทองผาภูมิ,ท่ามะกา,ท่าม่วง,บ่อพลอย,พนมทวน,ศรีสวัสดิ์,สังขละบุรี,หนองปรือ,ห้วยกระเจา,เมืองกาญจนบุรี,เลาขวัญ,ไทรโยค";
        mainAmperStrings[4] = "กมลาไสย,กุฉินารายณ์,คำม่วง,ฆ้องชัย,ดอนจาน,ท่าคันโท,นาคู,นามน,ยางตลาด,ร่องคำ,สมเด็จ,สหัสขันธ์,สามชัย,หนองกุงศรี,ห้วยผึ้ง,ห้วยเม็ก,เขาวง,เมืองกาฬสินธุ์";
        mainAmperStrings[5] = "ขาณุวรลักษบุรี,คลองขลุง,คลองลาน,ทรายทองวัฒนา,บึงสามัคคี,ปางศิลาทอง,พรานกระต่าย,ลานกระบือ,เมืองกำแพงเพชร,โกสัมพีนคร,ไทรงาม";
        mainAmperStrings[6] = "กระนวน,ชนบท,ชุมแพ,ซำสูง,น้ำพอง,บ้านฝาง,บ้านแฮด,บ้านไผ่,พระยืน,พล,ภูผาม่าน,ภูเวียง,มัญจาคีรี,สีชมพู,หนองนาคำ,หนองสองห้อง,หนองเรือ,อุบลรัตน์,เขาสวนกวาง,เปือยน้อย,เมืองขอนแก่น,แวงน้อย,โคกโพธิ์ไชย,โนนศิลา";
        mainAmperStrings[7] = "ขลุง,ท่าใหม่,นายายอาม,มะขาม,สอยดาว,เขาคิชฌกูฏ,เมืองจันทบุรี,แก่งหางแมว,แหลมสิงห์,โป่งน้ำร้อน";
        mainAmperStrings[8] = "คลองเขื่อน,ท่าตะเกียบ,บางคล้า,บางน้ำเปรี้ยว,บางปะกง,บ้านโพธิ์,พนมสารคาม,ราชสาส์น,สนามชัยเขต,เมืองฉะเชิงเทรา,แปลงยาว";
        mainAmperStrings[9] = "บางละมุง,บ่อทอง,บ้านบึง,พนัสนิคม,พานทอง,ศรีราชา,สัตหีบ,หนองใหญ่,เกาะจันทร์,เกาะสีชัง,เมืองชลบุรี";
        mainAmperStrings[10] = "มโนรมย์,วัดสิงห์,สรรคบุรี,สรรพยา,หนองมะโมง,หันคา,เนินขาม,เมืองชัยนาท";
        mainAmperStrings[11] = "คอนสวรรค์,คอนสาร,จัตุรัส,ซับใหญ่,บำเหน็จณรงค์,บ้านเขว้า,บ้านแท่น,ภักดีชุมพล,ภูเขียว,หนองบัวระเหว,หนองบัวแดง,เกษตรสมบูรณ์,เทพสถิต,เนินสง่า,เมืองชัยภูมิ,แก้งคร้อ";
        mainAmperStrings[12] = "ทุ่งตะโก,ท่าแซะ,ปะทิว,พะโต๊ะ,ละแม,สวี,หลังสวน,เมืองชุมพร";
        mainAmperStrings[13] = "ขุนตาล,ดอยหลวง,ป่าแดด,พญาเม็งราย,พาน,เชียงของ,เชียงแสน,เทิง,เมืองเชียงราย,เวียงชัย,เวียงป่าเป้า,เวียงเชียงรุ้ง,เวียงแก่น,แม่จัน,แม่ฟ้าหลวง,แม่ลาว,แม่สรวย,แม่สาย";
        mainAmperStrings[14] = "กัลยาณิวัฒนา,จอมทอง,ดอยสะเก็ด,ดอยหล่อ,ดอยเต่า,ฝาง,พร้าว,สะเมิง,สันกำแพง,สันทราย,สันป่าตอง,สารภี,หางดง,อมก๋อย,ฮอด,เชียงดาว,เมืองเชียงใหม่,เวียงแหง,แม่ริม,แม่วาง,แม่ออน,แม่อาย,แม่แจ่ม,แม่แตง,ไชยปราการ";
        mainAmperStrings[15] = "กันตัง,นาโยง,ปะเหลียน,ย่านตาขาว,รัษฎา,วังวิเศษ,สิเกา,หาดสำราญ,ห้วยยอด,เมืองตรัง";
        mainAmperStrings[16] = "เกาะกูด,เกาะช้าง,เขาสมิง,คลองใหญ่,บ่อไร่,เมืองตราด,แหลมงอบ";
        mainAmperStrings[17] = "ท่าสองยาง,บ้านตาก,พบพระ,วังเจ้า,สามเงา,อุ้มผาง,เมืองตาก,แม่ระมาด,แม่สอด";
        mainAmperStrings[18] = "บ้านนา,ปากพลี,องครักษ์,เมืองนครนายก";
        mainAmperStrings[19] = "กำแพงแสน,ดอนตูม,นครชัยศรี,บางเลน,พุทธมณฑล,สามพราน,เมืองนครปฐม";
        mainAmperStrings[20] = "ท่าอุเทน,ธาตุพนม,นาทม,นาหว้า,นาแก,บ้านแพง,ปลาปาก,วังยาง,ศรีสงคราม,เมืองนครพนม,เรณูนคร,โพนสวรรค์";
        mainAmperStrings[21] = "ขามทะเลสอ,ขามสะแกแสง,แก้งสนามนาง,คง,ครบุรี,จักราช,ชุมพวง,เฉลิมพระเกียรติ,ด่านขุนทด,บัวลาย,บัวใหญ่,บ้านเหลื่อม,ประทาย,ปักธงชัย,ปากช่อง,พระทองคำ,พิมาย,ลำทะเมนชัย," +
                "วังน้ำเขียว,สีคิ้ว,สีดา,สูงเนิน,หนองบุญมาก,ห้วยแถลง,เทพารักษ์,เมืองนครราชสีมา,เมืองยาง,เสิงสาง,โชคชัย,โนนสูง,โนนแดง,โนนไทย";
        mainAmperStrings[22] = "ขนอม,จุฬาภรณ์,ฉวาง,ชะอวด,ช้างกลาง,ถ้ำพรรณรา,ทุ่งสง,ทุ่งใหญ่,ท่าศาลา,นบพิตำ,นาบอน,บางขัน,ปากพนัง,พรหมคีรี,พิปูน,ร่อนพิบูลย์,ลานสกา,สิชล,หัวไทร,เฉลิมพระเกียรติ,เชียรใหญ่,เมืองนครศรีธรรมราช";
        mainAmperStrings[23] = "ชุมตาบง,ชุมแสง,ตากฟ้า,ตาคลี,ท่าตะโก,บรรพตพิสัย,พยุหะคีรี,ลาดยาว,หนองบัว,เก้าเลี้ยว,เมืองนครสวรรค์,แม่วงก์,โกรกพระ,ไพศาลี";
        mainAmperStrings[24] = "บางกรวย,บางบัวทอง,บางใหญ่,ปากเกร็ด,เมืองนนทบุรี,ไทรน้อย";
        mainAmperStrings[25] = "จะแนะ,ตากใบ,บาเจาะ,ยี่งอ,ระแงะ,รือเสาะ,ศรีสาคร,สุคิริน,สุไหงปาดี,สุไหงโก-ลก,เมืองนราธิวาส,แว้ง";
        mainAmperStrings[26] = "ทุ่งช้าง,ท่าวังผา,นาน้อย,นาหมื่น,บ่อเกลือ,บ้านหลวง,ปัว,ภูเพียง,สองแคว,สันติสุข,เฉลิมพระเกียรติ,เชียงกลาง,เมืองน่าน,เวียงสา,แม่จริม";
        mainAmperStrings[27] = "บึงโขงหลง,บุ่งคล้า,ปากคาด,พรเจริญ,ศรีวิไล,เซกา,เมืองบึงกาฬ,โซ่พิสัย";
        mainAmperStrings[29] = "กระสัง,คูเมือง,ชำนิ,นางรอง,นาโพธิ์,บ้านกรวด,บ้านด่าน,บ้านใหม่ไชยพจน์,ประโคนชัย,ปะคำ,พลับพลาชัย,พุทไธสง,ละหานทราย,ลำปลายมาศ,สตึก,หนองกี่,หนองหงส์,ห้วยราช,เฉลิมพระเกียรติ,เมืองบุรีรัมย์,แคนดง,โนนดินแดง,โนนสุวรรณ";
        mainAmperStrings[30] = "คลองหลวง,ธัญบุรี,ลาดหลุมแก้ว,ลำลูกกา,สามโคก,หนองเสือ,เมืองปทุมธานี";
        mainAmperStrings[31] = "กุยบุรี,ทับสะแก,บางสะพาน,บางสะพานน้อย,ปราณบุรี,สามร้อยยอด,หัวหิน,เมืองประจวบคีรีขันธ์,ปราณบุรี,สามร้อยยอด";
        mainAmperStrings[32] = "กบินทร์บุรี,นาดี,บ้านสร้าง,ประจันตคาม,ศรีมหาโพธิ,ศรีมโหสถ,เมืองปราจีนบุรี";
        mainAmperStrings[33] = "กะพ้อ,ทุ่งยางแดง,ปะนาเระ,มายอ,ยะรัง,ยะหริ่ง,สายบุรี,หนองจิก,เมืองปัตตานี,แม่ลาน,โคกโพธิ์,ไม้แก่น";
        mainAmperStrings[34] = "ท่าเรือ,นครหลวง,บางซ้าย,บางบาล,บางปะหัน,บางปะอิน,บางไทร,บ้านแพรก,ผักไห่,พระนครศรีอยุธยา,ภาชี,มหาราช,ลาดบัวหลวง,วังน้อย,อุทัย,เสนา";
        mainAmperStrings[35] = "จุน,ดอกคำใต้,ปง,ภูกามยาว,ภูซาง,เชียงคำ,เชียงม่วน,เมืองพะเยา,แม่ใจ";
        mainAmperStrings[36] = "กะปง,คุระบุรี,ตะกั่วทุ่ง,ตะกั่วป่า,ทับปุด,ท้ายเหมือง,เกาะยาว,เมืองพังงา";
        mainAmperStrings[37] = "กงหรา,ควนขนุน,ตะโหมด,บางแก้ว,ปากพะยูน,ป่าบอน,ป่าพะยอม,ศรีนครินทร์,ศรีบรรพต,เขาชัยสน,เมืองพัทลุง";
        mainAmperStrings[38] = "ดงเจริญ,ตะพานหิน,ทับคล้อ,บางมูลนาก,บึงนาราง,วังทรายพูน,สากเหล็ก,สามง่าม,เมืองพิจิตร,โพทะเล,โพธิ์ประทับช้าง";
        mainAmperStrings[39] = "ชาติตระการ,นครไทย,บางกระทุ่ม,บางระกำ,พรหมพิราม,วังทอง,วัดโบสถ์,เนินมะปราง,เมืองพิษณุโลก";
        mainAmperStrings[40] = "ชะอำ,ท่ายาง,บ้านลาด,บ้านแหลม,หนองหญ้าปล้อง,เขาย้อย,เมืองเพชรบุรี,แก่งกระจาน";
        mainAmperStrings[41] = "ชนแดน,น้ำหนาว,บึงสามพัน,วังโป่ง,วิเชียรบุรี,ศรีเทพ,หนองไผ่,หล่มสัก,หล่มเก่า,เขาค้อ,เมืองเพชรบูรณ์";
        mainAmperStrings[42] = "ร้องกวาง,ลอง,วังชิ้น,สอง,สูงเม่น,หนองม่วงไข่,เด่นชัย,เมืองแพร่";
        mainAmperStrings[43] = "กะทู้,ถลาง,เมืองภูเก็ต";
        mainAmperStrings[44] = "กันทรวิชัย,กุดรัง,ชื่นชม,นาดูน,นาเชือก,บรบือ,พยัคฆภูมิพิสัย,ยางสีสุราช,วาปีปทุม,เชียงยืน,เมืองมหาสารคาม,แกดำ,โกสุมพิสัย";
        mainAmperStrings[45] = "คำชะอี,ดงหลวง,ดอนตาล,นิคมคำสร้อย,หนองสูง,หว้านใหญ่,เมืองมุกดาหาร";
        mainAmperStrings[46] = "ขุนยวม,ปางมะผ้า,ปาย,สบเมย,เมืองแม่ฮ่องสอน,แม่ลาน้อย,แม่สะเรียง";
        mainAmperStrings[47] = "กุดชุม,คำเขื่อนแก้ว,ค้อวัง,ทรายมูล,ป่าติ้ว,มหาชนะชัย,เมืองยโสธร,เลิงนกทา,ไทยเจริญ";
        mainAmperStrings[48] = "กรงปินัง,กาบัง,ธารโต,บันนังสตา,ยะหา,รามัน,เบตง,เมืองยะลา";
        mainAmperStrings[49] = "จตุรพักตร์พิมาน,จังหาร,ทุ่งเขาหลวง,ธวัชบุรี,ปทุมรัตต์,พนมไพร,ศรีสมเด็จ,สุวรรณภูมิ,หนองพอก,หนองฮี,อาจสามารถ,เกษตรวิสัย,เชียงขวัญ,เมยวดี,เมืองร้อยเอ็ด,เมืองสรวง,เสลภูมิ,โพธิ์ชัย,โพนทราย,โพนทอง";
        mainAmperStrings[50] = "กระบุรี,กะเปอร์,ละอุ่น,สุขสำราญ,เมืองระนอง";
        mainAmperStrings[51] = "นิคมพัฒนา,บ้านค่าย,บ้านฉาง,ปลวกแดง,วังจันทร์,เขาชะเมา,เมืองระยอง,แกลง";
        mainAmperStrings[52] = "จอมบึง,ดำเนินสะดวก,บางแพ,บ้านคา,บ้านโป่ง,ปากท่อ,วัดเพลง,สวนผึ้ง,เมืองราชบุรี,โพธาราม";
        mainAmperStrings[53] = "ชัยบาดาล,ท่าวุ้ง,ท่าหลวง,บ้านหมี่,พัฒนานิคม,ลำสนธิ,สระโบสถ์,หนองม่วง,เมืองลพบุรี,โคกสำโรง,โคกเจริญ";
        mainAmperStrings[54] = "งาว,วังเหนือ,สบปราบ,ห้างฉัตร,เกาะคา,เถิน,เมืองปาน,เมืองลำปาง,เสริมงาม,แจ้ห่ม,แม่ทะ,แม่พริก,แม่เมาะ";
        mainAmperStrings[55] = "ทุ่งหัวช้าง,บ้านธิ,บ้านโฮ่ง,ป่าซาง,ลี้,เมืองลำพูน,เวียงหนองล่อง,แม่ทา";
        mainAmperStrings[56] = "ด่านซ้าย,ท่าลี่,นาด้วง,นาแห้ว,ปากชม,ผาขาว,ภูกระดึง,ภูหลวง,ภูเรือ,วังสะพุง,หนองหิน,เชียงคาน,เมืองเลย,เอราวัณ";
        mainAmperStrings[57] = "กันทรลักษ์,กันทรารมย์,ขุขันธ์,ขุนหาญ,น้ำเกลี้ยง,บึงบูรพ์,ปรางค์กู่,พยุห์,ภูสิงห์,ยางชุมน้อย,ราษีไศล,วังหิน,ศรีรัตนะ,ศิลาลาด,ห้วยทับทัน,อุทุมพรพิสัย,เบญจลักษ์,เมืองศรีสะเกษ,โนนคูณ,โพธิ์ศรีสุวรรณ,ไพรบึง";
        mainAmperStrings[58] = "กุดบาก,กุสุมาลย์,คำตากล้า,นิคมน้ำอูน,บ้านม่วง,พรรณานิคม,พังโคน,ภูพาน,วานรนิวาส,วาริชภูมิ,สว่างแดนดิน,ส่องดาว,อากาศอำนวย,เจริญศิลป์,เต่างอย,เมืองสกลนคร,โคกศรีสุพรรณ,โพนนาแก้ว";
        mainAmperStrings[59] = "กระแสสินธุ์,คลองหอยโข่ง,ควนเนียง,จะนะ,นาทวี,นาหม่อม,บางกล่ำ,ระโนด,รัตภูมิ,สทิงพระ,สะบ้าย้อย,สะเดา,สิงหนคร,หาดใหญ่,เทพา,เมืองสงขลา";
        mainAmperStrings[60] = "ควนกาหลง,ควนโดน,ทุ่งหว้า,ท่าแพ,มะนัง,ละงู,เมืองสตูล";
        mainAmperStrings[61] = "บางบ่อ,บางพลี,บางเสาธง,พระประแดง,พระสมุทรเจดีย์,เมืองสมุทรปราการ";
        mainAmperStrings[62] = "บางคนที,อัมพวา,เมืองสมุทรสงคราม";
        mainAmperStrings[63] = "กระทุ่มแบน,บ้านแพ้ว,เมืองสมุทรสาคร";
        mainAmperStrings[64] = "คลองหาด,ตาพระยา,วังน้ำเย็น,วังสมบูรณ์,วัฒนานคร,อรัญประเทศ,เขาฉกรรจ์,เมืองสระแก้ว,โคกสูง";
        mainAmperStrings[65] = "ดอนพุด,บ้านหมอ,พระพุทธบาท,มวกเหล็ก,วังม่วง,วิหารแดง,หนองแค,หนองแซง,หนองโดน,เฉลิมพระเกียรติ,เมืองสระบุรี,เสาไห้,แก่งคอย";
        mainAmperStrings[66] = "ค่ายบางระจัน,ท่าช้าง,บางระจัน,พรหมบุรี,อินทร์บุรี,เมืองสิงห์บุรี";
        mainAmperStrings[67] = "กงไกรลาศ,คีรีมาศ,ทุ่งเสลี่ยม,บ้านด่านลานหอย,ศรีนคร,ศรีสัชนาลัย,ศรีสำโรง,สวรรคโลก,เมืองสุโขทัย";
        mainAmperStrings[68] = "ดอนเจดีย์,ด่านช้าง,บางปลาม้า,ศรีประจันต์,สองพี่น้อง,สามชุก,หนองหญ้าไซ,อู่ทอง,เดิมบางนางบวช,เมืองสุพรรณบุรี";
        mainAmperStrings[69] = "กาญจนดิษฐ์,คีรีรัฐนิคม,ชัยบุรี,ดอนสัก,ท่าฉาง,ท่าชนะ,บ้านตาขุน,บ้านนาสาร,บ้านนาเดิม,พนม,พระแสง,พุนพิน,วิภาวดี,เกาะพะงัน,เกาะสมุย,เคียนซา,เมืองสุราษฎร์ธานี,เวียงสระ,ไชยา";
        mainAmperStrings[70] = "กาบเชิง,จอมพระ,ชุมพลบุรี,ท่าตูม,บัวเชด,ปราสาท,พนมดงรัก,รัตนบุรี,ลำดวน,ศรีณรงค์,ศีขรภูมิ,สนม,สังขะ,สำโรงทาบ,เขวาสินรินทร์,เมืองสุรินทร์,โนนนารายณ์";
        mainAmperStrings[71] = "ท่าบ่อ,รัตนวาปี,ศรีเชียงใหม่,สระใคร,สังคม,เฝ้าไร่,เมืองหนองคาย,โพธิ์ตาก,โพนพิสัย";
        mainAmperStrings[72] = "นากลาง,นาวัง,ศรีบุญเรือง,สุวรรณคูหา,เมืองหนองบัวลำภู,โนนสัง";
        mainAmperStrings[73] = "ป่าโมก,วิเศษชัยชาญ,สามโก้,เมืองอ่างทอง,แสวงหา,โพธิ์ทอง,ไชโย";
        mainAmperStrings[74] = "ชานุมาน,ปทุมราชวงศา,พนา,ลืออำนาจ,หัวตะพาน,เมืองอำนาจเจริญ,เสนางคนิคม";
        mainAmperStrings[75] = "กุดจับ,กุมภวาปี,กู่แก้ว,ทุ่งฝน,นายูง,น้ำโสม,บ้านดุง,บ้านผือ,ประจักษ์ศิลปาคม,พิบูลย์รักษ์,วังสามหมอ,ศรีธาตุ,สร้างคอม,หนองวัวซอ,หนองหาน,หนองแสง,เพ็ญ,เมืองอุดรธานี,โนนสะอาด,ไชยวาน";
        mainAmperStrings[76] = "ตรอน,ทองแสนขัน,ท่าปลา,น้ำปาด,บ้านโคก,พิชัย,ฟากท่า,ลับแล,เมืองอุตรดิตถ์";
        mainAmperStrings[77] = "ทัพทัน,บ้านไร่,ลานสัก,สว่างอารมณ์,หนองขาหย่าง,หนองฉาง,ห้วยคต,เมืองอุทัยธานี";
        mainAmperStrings[78] = "กุดข้าวปุ้น,ดอนมดแดง,ตระการพืชผล,ตาลสุม,ทุ่งศรีอุดม,นาจะหลวย,นาตาล,นาเยีย,น้ำขุ่น,น้ำยืน,บุณฑริก,พิบูลมังสาหาร,ม่วงสามสิบ,วารินชำราบ,ศรีเมืองใหม่,สว่างวีระวงศ์,สำโรง,สิรินธร,เขมราฐ,เขื่องใน,เดชอุดม,เมืองอุบลราชธานี,เหล่าเสือโก้ก,โขงเจียม,โพธิ์ไทร";

        String[] rowStrings = mainAmperStrings[position].split(",");

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB01Activity.this,
                android.R.layout.simple_list_item_1, rowStrings);
        spinner.setAdapter(stringArrayAdapter);

    }


//     จังหวัด
        private void province1Spinner() {
            Spinner spinner = findViewById(R.id.spinnerProvince1);
            String[] strings = new String[]{"เลือกจังหวัด", "กระบี่", "กรุงเทพมหานคร", "กาญจนบุรี", "กาฬสินธุ์", "กำแพงเพชร", "ขอนแก่น", "จันทบุรี", "ฉะเชิงเทรา", "ชลบุรี"
                    , "ชัยนาท", "ชัยภูมิ", "ชุมพร", "ตรัง", "ตราด", "ตาก", "นครนายก", "นครปฐม", "นครพนม", "นครราชสีมา", "นครศรีธรรมราช", "นครสวรรค์", "นนทบุรี", "นราธิวาส",
                    "น่าน", "บึงกาฬ", "บุรีรัมย์", "ปทุมธานี", "ประจวบคีรีขันธ์", "ปราจีนบุรี", "ปัตตานี", "พระนครศรีอยุธยา", "พะเยา", "พังงา", "พัทลุง", "พิจิตร", "พิษณุโลก", "ภูเก็ต", "มหาสารคาม",
                    "มุกดาหาร", "ยะลา", "ยโสธร", "ระนอง", "ระยอง", "ราชบุรี", "ร้อยเอ็ด", "ลพบุรี", "ลำปาง", "ลำพูน", "ศรีสะเกษ", "สกลนคร", "สงขลา", "สตูล", "สมุทรปราการ", "สมุทรสงคราม",
                    "สมุทรสาคร", "สระบุรี", "สระแก้ว", "สิงห์บุรี", "สุพรรณบุรี", "สุราษฎร์ธานี", "สุรินทร์", "สุโขทัย", "หนองคาย", "หนองบัวลำภู", "อำนาจเจริญ", "อุดรธานี",
                    "อุตรดิตถ์", "อุทัยธานี", "อุบลราชธานี", "อ่างทอง", "เชียงราย", "เชียงใหม่", "เพชรบุรี", "เพชรบูรณ์", "เลย", "แพร่", "แม่ฮ่องสอน", "ประจวบคีรีขันธ์", "ชุมพร"};
            ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB01Activity.this,
                    android.R.layout.simple_list_item_1, strings);
            spinner.setAdapter(stringArrayAdapter);
        }

//     ประเภท
    private void prapetSpinner() {
        Spinner spinner = findViewById(R.id.spinnerPrapet);
        String[] strings = new String[]{"เลือกวัตถุประสงค์การประเมิน", "เพื่อพิจารณาขอสินเชื่อ", "เพื่อทรามูลค่าปัจจุบัน", "เพื่อตั้งสำรองหนี้", "เพื่อซื้อทรัพย์บังคับคดี", "เพื่อวัตถุประสงค์ NPA", "Backtest"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB01Activity.this,
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);


////     ถ้าไม่เอารหัสไปรษณ๊ย์ลบตั้งแต่ตรงนี้
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                createSpinnerTambon(position);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//    }
//
//    private void createSpinnerTambon(int position) {
//
//        Spinner spinner = findViewById(R.id.spinnerZipcode);
//        String[] mainAmperStrings = new String[3];
//        mainAmperStrings[0] = "เลือกอำเภอ/รหัสไปรษณีย์";
//        mainAmperStrings[1] = "81000,81110,81120,81130,81150,81160,81170,81180,81190,80240,";
//        mainAmperStrings[2] = "10100,10110,10120,10150,10160,10140,10160,10170,10200,10210,10220,10210,10230," +
//                "10240,10250,10260,10300,10310,10330,10400,10500,10510,10520,10530,10600,10700,10800,10900";
//
//        String[] tambonStrings = mainAmperStrings[position].split(",");
//
//        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB01Activity.this,
//                android.R.layout.simple_list_item_1, tambonStrings);
//        spinner.setAdapter(stringArrayAdapter);
////        จนถึงตรงนี้

        buttonDate = (Button) findViewById(R.id.buttonDate);
        EditTextDate = (EditText) findViewById(R.id.EditTextDate);

//      DatePicker
        buttonDate.setOnClickListener(this);
    } // Main Method

    @Override
    public void onClick(View v) {
//      DD/MM/YYYY ผู้ใช้งาน
        if (v==buttonDate){
            final Calendar calendar = Calendar.getInstance();
            day = calendar.get(Calendar.DAY_OF_MONTH);
            month = calendar.get(Calendar.MONTH);
            year = calendar.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthofYear, int dayOfMonth) {
                    EditTextDate.setText(dayOfMonth + "/" + (monthofYear + 1) + "/" + year);
                }
            }, day, month, year);
            datePickerDialog.show();
        }


//        Add toolbar to the Activity
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("คำสั่งงาน");

        toolbar.setNavigationIcon(R.drawable.logo2);
    }

    //      Add item UpLoad to Database
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_land_tab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.itemUpload) {
            Toast.makeText(BankGHB01Activity.this, "อัปโหลดเสร็จ", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }//Main Method

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}//Main Class


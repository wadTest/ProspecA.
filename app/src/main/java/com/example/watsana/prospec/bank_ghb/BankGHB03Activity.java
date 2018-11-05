package com.example.watsana.prospec.bank_ghb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.watsana.prospec.R;


public class BankGHB03Activity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_ghb03);

//        Province Spinner
        provinceSpinner();

//        YesNo Controller
        yesNoController();


    }

    private void yesNoController() {
        RadioGroup radioGroup = findViewById(R.id.ragConfirm);
        final RadioButton yesRadioButton = findViewById(R.id.radYes);
        RadioButton noRadioButton = findViewById(R.id.radNo);
        final LinearLayout linearLayout = findViewById(R.id.linearSpecial);
        linearLayout.setVisibility(View.INVISIBLE);

        yesRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("20octV3", "Click");

                if (yesRadioButton.isChecked()) {
                    linearLayout.setVisibility(View.VISIBLE);
                } else {
                    linearLayout.setVisibility(View.INVISIBLE);
                }
            }
        });
        noRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yesRadioButton.isChecked()) {
                    linearLayout.setVisibility(View.VISIBLE);
                } else {
                    linearLayout.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    private void provinceSpinner() {
        Spinner spinner = findViewById(R.id.spinnerProvince);
        String[] strings = new String[]{"เลือกจังหวัด", "กระบี่", "กรุงเทพมหานคร", "กาญจนบุรี", "กาฬสินธุ์", "กำแพงเพชร", "ขอนแก่น", "จันทบุรี", "ฉะเชิงเทรา", "ชลบุรี"
                , "ชัยนาท", "ชัยภูมิ", "ชุมพร", "ตรัง", "ตราด", "ตาก", "นครนายก", "นครปฐม", "นครพนม", "นครราชสีมา", "นครศรีธรรมราช", "นครสวรรค์", "นนทบุรี", "นราธิวาส",
                "น่าน", "บึงกาฬ", "บุรีรัมย์", "ปทุมธานี", "ประจวบคีรีขันธ์", "ปราจีนบุรี", "ปัตตานี", "พระนครศรีอยุธยา", "พะเยา", "พังงา", "พัทลุง", "พิจิตร", "พิษณุโลก", "ภูเก็ต", "มหาสารคาม",
                "มุกดาหาร", "ยะลา", "ยโสธร", "ระนอง", "ระยอง", "ราชบุรี", "ร้อยเอ็ด", "ลพบุรี", "ลำปาง", "ลำพูน", "ศรีสะเกษ", "สกลนคร", "สงขลา", "สตูล", "สมุทรปราการ", "สมุทรสงคราม",
                "สมุทรสาคร", "สระบุรี", "สระแก้ว", "สิงห์บุรี", "สุพรรณบุรี", "สุราษฎร์ธานี", "สุรินทร์", "สุโขทัย", "หนองคาย", "หนองบัวลำภู", "อำนาจเจริญ", "อุดรธานี",
                "อุตรดิตถ์", "อุทัยธานี", "อุบลราชธานี", "อ่างทอง", "เชียงราย", "เชียงใหม่", "เพชรบุรี", "เพชรบูรณ์", "เลย", "แพร่", "แม่ฮ่องสอน", "ประจวบคีรีขันธ์", "ชุมพร"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB03Activity.this,
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
        String[] mainAmperStrings = new String[78];
        mainAmperStrings[0] = "เลือกอำเภอ/เขต";
        mainAmperStrings[1] = "คลองท่อม,ปลายพระยา,ลำทับ,อ่าวลึก,เกาะลันตา,เขาพนม,เมืองกระบี่,เหนือคลอง,";
        mainAmperStrings[2] = "คลองสาน,คลองสามวา,คลองเตย,คันนายาว,จตุจักร,จอมทอง,ดอนเมือง,ดินแดง,ดุสิต,ตลิ่งชัน,ทวีวัฒนาทุ่งครุ,ธนบุรี,บางกอกน้อย,บางกอกใหญ่,บางกะปิ," +
                "บางขุนเทียน,บางคอแหลม,บางซื่อ,บางบอน,บางพลัด,บางรัก,บางเขน,บางแค,บึงกุ่ม,ปทุมวัน,ประเวศ,ป้อมปราบศัตรูพ่าย,พญาไท,พระนคร,พระโขนง,ภาษีเจริญ,มีนบุรี,ยานนาวา,ราชเทวี,ราษฎร์บูรณะ," +
                "ลาดกระบัง,ลาดพร้าว,วังทองหลาง,วัฒนา,สวนหลวง,สะพานสูง,สัมพันธวงศ์,สาทร,สายไหม,หนองจอก,หนองแขม,หลักสี่,ห้วยขวาง";
        mainAmperStrings[3] = "ด่านมะขามเตี้ย,ทองผาภูมิ,ท่ามะกา,ท่าม่วง,บ่อพลอย,พนมทวน,ศรีสวัสดิ์,สังขละบุรี,หนองปรือ,ห้วยกระเจา,เมืองกาญจนบุรี,เลาขวัญ,ไทรโยค";
        mainAmperStrings[4] = "กมลาไสย,กุฉินารายณ์,คำม่วง,ฆ้องชัย,ดอนจาน,ท่าคันโท,นาคู,นามน,ยางตลาด,ร่องคำ,สมเด็จ,สหัสขันธ์,สามชัย,หนองกุงศรี,ห้วยผึ้ง,ห้วยเม็ก,เขาวง,เมืองกาฬสินธุ์";
        mainAmperStrings[5] = "ขาณุวรลักษบุรี,คลองขลุง,คลองลาน,ทรายทองวัฒนา,บึงสามัคคี,ปางศิลาทอง,พรานกระต่าย,ลานกระบือ,เมืองกำแพงเพชร,โกสัมพีนคร,ไทรงาม";
        mainAmperStrings[6] = "กระนวน,ชนบท,ชุมแพ,ซำสูง,น้ำพอง,บ้านฝาง,บ้านแฮด,บ้านไผ่,พระยืน,พล,ภูผาม่าน,ภูเวียง,มัญจาคีรี,สีชมพู,หนองนาคำ,หนองสองห้อง,หนองเรือ,อุบลรัตน์,เขาสวนกวาง,เปือยน้อย,เมืองขอนแก่น,แวงน้อย,โคกโพธิ์ไชย,โนนศิลา";
        mainAmperStrings[7] = "ขลุง,ท่าใหม่,นายายอาม,มะขาม,สอยดาว,เขาคิชฌกูฏ,เมืองจันทบุรี,แก่งหางแมว,แหลมสิงห์,โป่งน้ำร้อน";
        mainAmperStrings[8] = "คลองเขื่อน,ท่าตะเกียบ,บางคล้า,บางน้ำเปรี้ยว,บางปะกง,บ้านโพธิ์,พนมสารคาม,ราชสาส์น,สนามชัยเขต,เมืองฉะเชิงเทรา,แปลงยาว";
        mainAmperStrings[9] = "บางละมุง,บ่อทอง,บ้านบึง,พนัสนิคม,พานทอง,ศรีราชา,สัตหีบ,หนองใหญ่,เกาะจันทร์,เกาะสีชัง,เมืองชลบุรี";
        mainAmperStrings[10] = "มโนรมย์,วัดสิงห์,สรรคบุรี,สรรพยา,หนองมะโมง,หันคา,เนินขาม,เมืองชัยนาท";
        mainAmperStrings[11] = "คอนสวรรค์,คอนสาร,จัตุรัส,ซับใหญ่,บำเหน็จณรงค์,บ้านเขว้า,บ้านแท่น,ภักดีชุมพล,ภูเขียว,หนองบัวระเหว,หนองบัวแดง,เกษตรสมบูรณ์,เทพสถิต,เนินสง่า,เมืองชัยภูมิ,แก้งคร้อ";
        mainAmperStrings[12] = "ทุ่งตะโก,ท่าแซะ,ปะทิว,พะโต๊ะ,ละแม,สวี,หลังสวน,เมืองชุมพร,";
        mainAmperStrings[13] = "ขุนตาล,ดอยหลวง,ป่าแดด,พญาเม็งราย,พาน,เชียงของ,เชียงแสน,เทิง,เมืองเชียงราย,เวียงชัย,เวียงป่าเป้า,เวียงเชียงรุ้ง,เวียงแก่น,แม่จัน,แม่ฟ้าหลวง,แม่ลาว,แม่สรวย,แม่สาย,";
        mainAmperStrings[14] = "กัลยาณิวัฒนา,จอมทอง,ดอยสะเก็ด,ดอยหล่อ,ดอยเต่า,ฝาง,พร้าว,สะเมิง,สันกำแพง,สันทราย,สันป่าตอง,สารภี,หางดง,อมก๋อย,ฮอด,เชียงดาว,เมืองเชียงใหม่,เวียงแหง,แม่ริม,แม่วาง,แม่ออน,แม่อาย,แม่แจ่ม,แม่แตง,ไชยปราการ";
        mainAmperStrings[15] = "กันตัง,นาโยง,ปะเหลียน,ย่านตาขาว,รัษฎา,วังวิเศษ,สิเกา,หาดสำราญ,ห้วยยอด,เมืองตรัง";
        mainAmperStrings[16] = "เกาะกูด,เกาะช้าง,เขาสมิง,คลองใหญ่,บ่อไร่,เมืองตราด,แหลมงอบ";
        mainAmperStrings[17] = "ท่าสองยาง,บ้านตาก,พบพระ,วังเจ้า,สามเงา,อุ้มผาง,เมืองตาก,แม่ระมาด,แม่สอด";
        mainAmperStrings[18] = "บ้านนา,ปากพลี,องครักษ์,เมืองนครนายก";
        mainAmperStrings[19] = "กำแพงแสน,ดอนตูม,นครชัยศรี,บางเลน,พุทธมณฑล,สามพราน,เมืองนครปฐม";
        mainAmperStrings[20] = "ท่าอุเทน,ธาตุพนม,นาทม,นาหว้า,นาแก,บ้านแพง,ปลาปาก,วังยาง,ศรีสงคราม,เมืองนครพนม,เรณูนคร,โพนสวรรค์";
        mainAmperStrings[21] = "0,1";
        mainAmperStrings[22] = "0,1";
        mainAmperStrings[23] = "0,1";
        mainAmperStrings[24] = "0,1";
        mainAmperStrings[25] = "0,1";
        mainAmperStrings[26] = "0,1";
        mainAmperStrings[27] = "0,1";
        mainAmperStrings[28] = "0,1";
        mainAmperStrings[29] = "0,1";
        mainAmperStrings[30] = "0,1";
        mainAmperStrings[31] = "0,1";
        mainAmperStrings[32] = "0,1";
        mainAmperStrings[33] = "0,1";
        mainAmperStrings[34] = "0,1";
        mainAmperStrings[35] = "0,1";
        mainAmperStrings[36] = "0,1";
        mainAmperStrings[37] = "0,1";
        mainAmperStrings[38] = "0,1";
        mainAmperStrings[39] = "0,1";
        mainAmperStrings[40] = "0,1";
        mainAmperStrings[41] = "0,1";
        mainAmperStrings[42] = "0,1";
        mainAmperStrings[43] = "0,1";
        mainAmperStrings[44] = "0,1";
        mainAmperStrings[45] = "0,1";
        mainAmperStrings[46] = "0,1";
        mainAmperStrings[47] = "0,1";
        mainAmperStrings[48] = "0,1";
        mainAmperStrings[49] = "0,1";
        mainAmperStrings[50] = "0,1";
        mainAmperStrings[51] = "0,1";
        mainAmperStrings[52] = "0,1";
        mainAmperStrings[53] = "0,1";
        mainAmperStrings[54] = "0,1";
        mainAmperStrings[55] = "0,1";
        mainAmperStrings[56] = "0,1";
        mainAmperStrings[57] = "0,1";
        mainAmperStrings[58] = "0,1";
        mainAmperStrings[59] = "0,1";
        mainAmperStrings[60] = "0,1";
        mainAmperStrings[61] = "0,1";
        mainAmperStrings[62] = "0,1";
        mainAmperStrings[63] = "0,1";
        mainAmperStrings[64] = "0,1";
        mainAmperStrings[65] = "0,1";
        mainAmperStrings[66] = "0,1";
        mainAmperStrings[67] = "0,1";
        mainAmperStrings[68] = "0,1";
        mainAmperStrings[69] = "0,1";
        mainAmperStrings[70] = "0,1";
        mainAmperStrings[71] = "0,1";
        mainAmperStrings[72] = "0,1";
        mainAmperStrings[73] = "0,1";
        mainAmperStrings[74] = "0,1";
        mainAmperStrings[75] = "0,1";
        mainAmperStrings[76] = "0,1";
        mainAmperStrings[77] = "0,1";

        String[] rowStrings = mainAmperStrings[position].split(",");

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB03Activity.this,
                android.R.layout.simple_list_item_1, rowStrings);
        spinner.setAdapter(stringArrayAdapter);


    }
}

package com.example.facerecognize;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ManagementFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // fragment_management.xml 레이아웃 연결
        View view = inflater.inflate(R.layout.fragment_management, container, false);

        // 버튼과 입력창 찾기
        Button btnRegister = view.findViewById(R.id.btnRegister);
        EditText etName = view.findViewById(R.id.etName);

        // 버튼 클릭 이벤트 설정
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                if (!name.isEmpty()) {
                    // TODO: 나중에 서버 통신 기능 추가
                    Toast.makeText(getActivity(), name + "님 등록 요청됨 (Java)", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}
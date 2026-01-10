package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.saved_recipes_legacy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.survivalcoding.gangnam2kiandroidstudy.R

/**
 * SavedRecipesLegacyFragment
 *
 * 이 Fragment는 "저장된 레시피 목록 화면"을 담당한다.
 *
 * Activity는 화면을 직접 그리지 않고,
 *   이 Fragment를 담는 컨테이너 역할만 수행한다.
 *
 * 실제 UI 구성(RecyclerView, 아이템 표시 등)은
 *   Fragment에서 처리하는 것이 레거시 Android 구조의 기본 패턴이다.
 */
class SavedRecipesLegacyFragment : Fragment() {

    /**
     * Fragment의 UI(View)를 생성하는 생명주기 메서드
     *
     * onCreateView는 Fragment가 화면에 보여질 View를
     * 언제, 어떻게 생성할지를 결정하는 지점이다.
     *
     * XML 레이아웃을 inflate하여 View 객체로 만들어 반환한다.
     *
     * 이 시점에서는 아직 View가 화면에 붙지 않았기 때문에
     *   findViewById, ViewBinding 초기화는 여기서 하지 않는다.
     */
    override fun onCreateView(
        inflater: LayoutInflater,        // XML → View로 변환하는 객체
        container: ViewGroup?,            // 이 Fragment가 붙을 부모 View
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(
            R.layout.fragment_saved_recipes_legacy, // 이 Fragment의 레이아웃
            container,
            false                                   // 부모에 즉시 붙이지 않음
        )
    }
}
